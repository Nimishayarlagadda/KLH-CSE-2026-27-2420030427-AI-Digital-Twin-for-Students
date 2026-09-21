# AI-Driven Digital Twin for Personalized Student Performance Prediction and Adaptive Learning

## Abstract
This project develops an AI-driven Digital Twin for students. The system maintains an evolving virtual representation of a student's academic and behavioral state using attendance, study hours, quiz marks, assignment completion, internal marks and previous performance. Machine Learning predicts academic performance, identifies academic risk and supports personalized recommendations. A what-if engine allows students to explore how changes in study habits and academic behavior may affect predicted performance.

## Objectives
- Build an evolving student Digital Twin
- Track academic and behavioral indicators
- Predict academic performance using Machine Learning
- Detect low, medium and high academic risk
- Generate personalized recommendations
- Support what-if analysis
- Demonstrate Adaptive Software Engineering through iterative development

## Technology Stack
Frontend: React + Vite
Backend: Spring Boot + Java 17
Database: MySQL
ML: Python + Flask + scikit-learn
Communication: REST APIs

## Repository
- data/ - datasets
- docs/ - requirements, design, diagrams, testing and ASE iterations
- reports/ - project documentation
- results/ - screenshots, graphs and ML results
- src/backend/ - Spring Boot
- src/frontend/ - React
- src/ml-service/ - Python ML service
- tests/ - automated test placeholders

## Run
1. Create MySQL database `digital_twin`.
2. Set the password in `src/backend/src/main/resources/application.properties`.
3. Start the backend with Maven.
4. Run `npm install` and `npm run dev` inside `src/frontend`.
5. Run `pip install -r requirements.txt` and `python app.py` inside `src/ml-service`.

## ASE Iterations
1. Foundation and architecture
2. Student and academic tracking
3. Digital Twin state engine
4. ML prediction and risk analysis
5. Recommendations and what-if analysis
6. Dashboard integration, testing and refinement
