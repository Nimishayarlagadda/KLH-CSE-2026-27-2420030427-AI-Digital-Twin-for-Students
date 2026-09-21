# System Architecture

```text
React Dashboard
      |
      v
Spring Boot REST API
      |
      +----------> MySQL
      |
      +----------> Python ML Service
                         |
                         v
                  Prediction Model
```

The Digital Twin combines the latest student state with historical indicators. Each new activity can update the state and recalculate prediction, risk and recommendations.
