def risk_level(score):
    if score >= 75:
        return "Low"
    if score >= 60:
        return "Medium"
    return "High"
