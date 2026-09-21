from flask import Flask,request,jsonify
import joblib, os, numpy as np

app=Flask(__name__)
model=None
path=os.path.join(os.path.dirname(__file__),"model.joblib")
if os.path.exists(path):
    model=joblib.load(path)

@app.get("/")
def home():
    return {"service":"AI Digital Twin ML Service","status":"running"}

@app.post("/predict")
def predict():
    data=request.get_json()
    values=[
        data.get("study_hours",0),
        data.get("attendance",0),
        data.get("quiz_average",0),
        data.get("assignment_completion",0),
        data.get("internal_marks",0),
        data.get("previous_gpa",0)
    ]
    if model is None:
        score=round(.2*values[0]*10+.3*values[1]+.2*values[2]+.15*values[3]+.1*values[4]+values[5]*1.5,2)
    else:
        score=float(model.predict(np.array(values).reshape(1,-1))[0])
    score=max(0,min(100,round(score,2)))
    risk="Low" if score>=75 else "Medium" if score>=60 else "High"
    return jsonify({"predicted_score":score,"risk_level":risk})

if __name__=="__main__":
    app.run(port=5000, debug=False)
