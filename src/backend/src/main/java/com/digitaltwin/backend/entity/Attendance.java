package com.digitaltwin.backend.entity;
import jakarta.persistence.*;
@Entity @Table(name="attendance")
public class Attendance {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
    private Long studentId;
    private Long subjectId;
    private Double percentage;
    public Long getId(){return id;}
    public Long getStudentId(){return studentId;}
    public void setStudentId(Long v){studentId=v;}
    public Long getSubjectId(){return subjectId;}
    public void setSubjectId(Long v){subjectId=v;}
    public Double getPercentage(){return percentage;}
    public void setPercentage(Double v){percentage=v;}
}
