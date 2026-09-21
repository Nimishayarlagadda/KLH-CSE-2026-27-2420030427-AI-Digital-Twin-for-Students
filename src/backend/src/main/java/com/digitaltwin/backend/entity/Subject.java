package com.digitaltwin.backend.entity;
import jakarta.persistence.*;
@Entity @Table(name="subjects")
public class Subject {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
    private String subjectCode;
    private String subjectName;
    public Long getId(){return id;}
    public String getSubjectCode(){return subjectCode;}
    public void setSubjectCode(String v){subjectCode=v;}
    public String getSubjectName(){return subjectName;}
    public void setSubjectName(String v){subjectName=v;}
}
