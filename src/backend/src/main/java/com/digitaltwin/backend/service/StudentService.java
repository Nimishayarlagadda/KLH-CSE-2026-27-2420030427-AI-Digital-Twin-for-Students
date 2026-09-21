package com.digitaltwin.backend.service;
import com.digitaltwin.backend.entity.Student;
import com.digitaltwin.backend.repository.StudentRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class StudentService {
    private final StudentRepository repository;
    public StudentService(StudentRepository repository){this.repository=repository;}
    public List<Student> getAll(){return repository.findAll();}
    public Student create(Student student){return repository.save(student);}
}
