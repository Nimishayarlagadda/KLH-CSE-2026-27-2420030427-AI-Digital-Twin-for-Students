package com.digitaltwin.backend.entity;
import jakarta.persistence.*;
@Entity @Table(name="students")
public class Student {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
    private String studentId;
    private String name;
    private String branch;
    private Integer semester;
    private Double cgpa;
    public Long getId(){return id;}
    public String getStudentId(){return studentId;}
    public void setStudentId(String v){studentId=v;}
    public String getName(){return name;}
    public void setName(String v){name=v;}
    public String getBranch(){return branch;}
    public void setBranch(String v){branch=v;}
    public Integer getSemester(){return semester;}
    public void setSemester(Integer v){semester=v;}
    public Double getCgpa(){return cgpa;}
    public void setCgpa(Double v){cgpa=v;}
}
