import pandas as pd
from sklearn.ensemble import RandomForestRegressor
from sklearn.model_selection import train_test_split
from sklearn.metrics import mean_absolute_error, r2_score
import joblib

data=pd.read_csv("../../data/raw/student_performance.csv")
X=data[["study_hours","attendance","quiz_average","assignment_completion","internal_marks","previous_gpa"]]
y=data["final_score"]
X_train,X_test,y_train,y_test=train_test_split(X,y,test_size=.2,random_state=42)
model=RandomForestRegressor(n_estimators=200,random_state=42)
model.fit(X_train,y_train)
pred=model.predict(X_test)
print("MAE:",mean_absolute_error(y_test,pred))
print("R2:",r2_score(y_test,pred))
joblib.dump(model,"model.joblib")
print("Model saved as model.joblib")
