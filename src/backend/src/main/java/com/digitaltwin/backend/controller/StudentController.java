package com.digitaltwin.backend.controller;
import com.digitaltwin.backend.entity.Student;
import com.digitaltwin.backend.service.StudentService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController @RequestMapping("/api/students")
@CrossOrigin(origins="http://localhost:5173")
public class StudentController {
    private final StudentService service;
    public StudentController(StudentService service){this.service=service;}
    @GetMapping public List<Student> getAll(){return service.getAll();}
    @PostMapping public Student create(@RequestBody Student student){return service.create(student);}
}
