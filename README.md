# KLH-CSE-2026-27-2420030427-AI-Digital-Twin-for-Students
# AI-Driven Digital Twin

## Team Members

| S. No. | University ID | Name          |
| ------ | ------------- | ------------- |
| 1      | 242030427     | Y. Nimisha    |
| 2      | 242090101     | N. Dhanu Sree |
| 3      | 242030309     | P. Abhinaya   |
| 4      | 242030584     | V. Sraavya    |

## Supervisor

**Guide:** [Swapna Reddy]

## Abstract

Students often struggle to understand how their study habits, attendance, academic performance, and daily activities influence their overall results. The AI-Driven Digital Twin for Personalized Student Performance Prediction and Adaptive Learning is an innovative software platform designed to create a virtual representation of each student and continuously analyze their academic and behavioral data using Artificial Intelligence.

The proposed system collects and analyzes student information such as study hours, attendance, quiz marks, assignment completion, and optionally sleep patterns. The digital twin continuously updates based on the student's latest activities and performance.

AI and Machine Learning techniques are used to predict academic performance, identify the risk of failure, analyze performance trends, and provide personalized recommendations for improving learning outcomes. The system also supports what-if analysis, allowing students to understand how changes in their study habits, attendance, or assignment completion may affect their predicted performance.

By combining Digital Twin technology with Artificial Intelligence and predictive analytics, the system provides students with an interactive representation of their academic progress. The proposed solution follows the principles of Adaptive Software Engineering by continuously adapting the digital twin according to changes in student behavior and performance.

The project aims to improve academic decision-making, identify potential academic risks at an early stage, encourage effective study habits, and provide personalized learning recommendations.

## Project Objectives

* Create a digital representation of a student's academic and behavioral profile.
* Analyze attendance, study hours, quiz marks, and assignment completion.
* Predict future academic performance using AI/ML techniques.
* Identify students who may be at risk of poor academic performance.
* Provide personalized learning recommendations.
* Support what-if analysis for different study and academic scenarios.
* Continuously update the digital twin based on new student data.

## Setup Instructions

### Prerequisites

Make sure the following are installed:

* Python 3.x
* Git
* Node.js and npm (if required by the frontend)
* MySQL (if used as the project database)

### 1. Clone the Repository

```bash
git clone <YOUR_GITHUB_REPOSITORY_URL>
cd <PROJECT_FOLDER>
```

### 2. Create a Virtual Environment

```bash
python -m venv venv
```

Activate it on Windows:

```bash
venv\Scripts\activate
```

For macOS/Linux:

```bash
source venv/bin/activate
```

### 3. Install Dependencies

```bash
pip install -r requirements.txt
```

### 4. Configure the Database

If the project uses MySQL, create the required database and update the database configuration in the project configuration file.

Example:

```text
Database: student_digital_twin
Host: localhost
Port: 3306
Username: <your_username>
Password: <your_password>
```

Do not commit passwords or other sensitive credentials to GitHub.

## Execution Instructions

After completing the setup, activate the virtual environment and run the application using the project's main entry point.

For a Python application:

```bash
python app.py
```

If the project uses Flask:

```bash
flask run
```

If the project contains a separate frontend:

```bash
npm install
npm start
```

> Update these commands according to the final project structure and actual entry-point files.

## Current Phase Status

### Phase 1 – Project Planning and Abstract

**Status: Completed**

* Project title finalized.
* Team members identified.
* Project abstract prepared.
* Core problem and proposed AI-Driven Digital Twin solution defined.

### Phase 2 – System Design and Architecture

**Status: In Progress**

* System architecture is being designed.
* Student data flow and digital twin components are being identified.
* AI/ML prediction and recommendation workflow is being planned.

### Phase 3 – Implementation

**Status: Planned / In Progress**

Planned implementation includes:

* Student registration and data collection.
* Academic and behavioral data storage.
* Digital twin generation.
* AI/ML-based performance prediction.
* Risk identification.
* Personalized recommendations.
* What-if analysis.

### Phase 4 – Testing and Evaluation

**Status: Pending**

* Model performance evaluation.
* Application testing.
* User testing.
* Accuracy and recommendation evaluation.

### Phase 5 – Final Deployment

**Status: Pending**

* Final integration.
* Deployment of the application.
* Documentation.
* Final project demonstration.

## Expected Outcome

The project aims to provide students with an intelligent and adaptive academic support system that can analyze their performance, predict potential academic risks, and provide personalized recommendations. The Digital Twin continuously represents the student's changing academic and behavioral state, enabling students to make better decisions about their learning strategies.

## Technology Stack

* **Programming:** Python
* **Artificial Intelligence:** Machine Learning
* **Data Processing:** Python-based data processing tools
* **Database:** MySQL
* **Frontend:** To be finalized
* **Backend:** To be finalized
* **Version Control:** Git and GitHub

## Repository Structure

```text
AI-Driven-Digital-Twin/
│
├── frontend/
├── backend/
├── models/
├── dataset/
├── database/
├── requirements.txt
├── README.md
└── app.py
```

> The repository structure should be updated to match the actual project files.

## Project Status

**Overall Status:** 🚧 Development in Progress

The project is currently progressing from project planning and system design toward implementation of the AI-driven Digital Twin, predictive analytics, and personalized recommendation components.
