package com.digitaltwin.backend.repository;
import com.digitaltwin.backend.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
public interface StudentRepository extends JpaRepository<Student,Long>{}
