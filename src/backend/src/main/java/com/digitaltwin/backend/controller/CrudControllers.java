package com.digitaltwin.backend.controller;

import com.digitaltwin.backend.entity.*;
import com.digitaltwin.backend.repository.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins="http://localhost:5173")
@RestController
class SubjectController {
    private final SubjectRepository repo;
    SubjectController(SubjectRepository repo){this.repo=repo;}
    @GetMapping("/api/subjects") List<Subject> all(){return repo.findAll();}
    @PostMapping("/api/subjects") Subject add(@RequestBody Subject x){return repo.save(x);}
}

@CrossOrigin(origins="http://localhost:5173")
@RestController
class AcademicController {
    private final AcademicRecordRepository repo;
    AcademicController(AcademicRecordRepository repo){this.repo=repo;}
    @GetMapping("/api/academic") List<AcademicRecord> all(){return repo.findAll();}
    @PostMapping("/api/academic") AcademicRecord add(@RequestBody AcademicRecord x){return repo.save(x);}
}

@CrossOrigin(origins="http://localhost:5173")
@RestController
class AttendanceController {
    private final AttendanceRepository repo;
    AttendanceController(AttendanceRepository repo){this.repo=repo;}
    @GetMapping("/api/attendance") List<Attendance> all(){return repo.findAll();}
    @PostMapping("/api/attendance") Attendance add(@RequestBody Attendance x){return repo.save(x);}
}

@CrossOrigin(origins="http://localhost:5173")
@RestController
class DailyActivityController {
    private final DailyActivityRepository repo;
    DailyActivityController(DailyActivityRepository repo){this.repo=repo;}
    @GetMapping("/api/activities") List<DailyActivity> all(){return repo.findAll();}
    @PostMapping("/api/activities") DailyActivity add(@RequestBody DailyActivity x){return repo.save(x);}
}
