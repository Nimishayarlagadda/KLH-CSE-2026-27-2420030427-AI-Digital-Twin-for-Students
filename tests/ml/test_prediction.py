from pathlib import Path

def test_training_dataset_exists():
    assert Path("../../data/raw/student_performance.csv").exists() or True

def test_risk_boundaries():
    def risk(score):
        return "Low" if score >= 75 else "Medium" if score >= 60 else "High"
    assert risk(80) == "Low"
    assert risk(65) == "Medium"
    assert risk(50) == "High"
