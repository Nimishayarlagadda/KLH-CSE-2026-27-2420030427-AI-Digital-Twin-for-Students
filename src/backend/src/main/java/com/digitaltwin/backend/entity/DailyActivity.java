package com.digitaltwin.backend.entity;
import jakarta.persistence.*;
import java.time.LocalDate;
@Entity @Table(name="daily_activities")
public class DailyActivity {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
    private Long studentId;
    private LocalDate activityDate;
    private Double studyHours;
    private Double sleepHours;
    private Double assignmentsCompleted;
    public Long getId(){return id;}
    public Long getStudentId(){return studentId;}
    public void setStudentId(Long v){studentId=v;}
    public LocalDate getActivityDate(){return activityDate;}
    public void setActivityDate(LocalDate v){activityDate=v;}
    public Double getStudyHours(){return studyHours;}
    public void setStudyHours(Double v){studyHours=v;}
    public Double getSleepHours(){return sleepHours;}
    public void setSleepHours(Double v){sleepHours=v;}
    public Double getAssignmentsCompleted(){return assignmentsCompleted;}
    public void setAssignmentsCompleted(Double v){assignmentsCompleted=v;}
}
