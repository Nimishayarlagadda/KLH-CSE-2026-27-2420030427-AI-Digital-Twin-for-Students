package com.digitaltwin.backend.entity;
import jakarta.persistence.*;
@Entity @Table(name="academic_records")
public class AcademicRecord {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
    private Long studentId;
    private Long subjectId;
    private Double quizAverage;
    private Double assignmentCompletion;
    private Double internalMarks;
    public Long getId(){return id;}
    public Long getStudentId(){return studentId;}
    public void setStudentId(Long v){studentId=v;}
    public Long getSubjectId(){return subjectId;}
    public void setSubjectId(Long v){subjectId=v;}
    public Double getQuizAverage(){return quizAverage;}
    public void setQuizAverage(Double v){quizAverage=v;}
    public Double getAssignmentCompletion(){return assignmentCompletion;}
    public void setAssignmentCompletion(Double v){assignmentCompletion=v;}
    public Double getInternalMarks(){return internalMarks;}
    public void setInternalMarks(Double v){internalMarks=v;}
}
