package com.digitaltwin.backend.service;

import com.digitaltwin.backend.entity.*;
import com.digitaltwin.backend.repository.*;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class DigitalTwinService {
    private final StudentRepository students;
    private final AcademicRecordRepository academics;
    private final AttendanceRepository attendance;
    private final DailyActivityRepository activities;

    public DigitalTwinService(StudentRepository students, AcademicRecordRepository academics,
                              AttendanceRepository attendance, DailyActivityRepository activities) {
        this.students = students;
        this.academics = academics;
        this.attendance = attendance;
        this.activities = activities;
    }

    public Map<String,Object> build(Long id) {
        Student s = students.findById(id).orElseThrow();
        double avgQuiz = academics.findAll().stream()
                .filter(x -> id.equals(x.getStudentId()) && x.getQuizAverage() != null)
                .mapToDouble(AcademicRecord::getQuizAverage).average().orElse(0);
        double avgAttendance = attendance.findAll().stream()
                .filter(x -> id.equals(x.getStudentId()) && x.getPercentage() != null)
                .mapToDouble(Attendance::getPercentage).average().orElse(0);
        double avgStudy = activities.findAll().stream()
                .filter(x -> id.equals(x.getStudentId()) && x.getStudyHours() != null)
                .mapToDouble(DailyActivity::getStudyHours).average().orElse(0);

        Map<String,Object> twin = new LinkedHashMap<>();
        twin.put("studentId", s.getStudentId());
        twin.put("name", s.getName());
        twin.put("cgpa", s.getCgpa());
        twin.put("averageQuiz", avgQuiz);
        twin.put("averageAttendance", avgAttendance);
        twin.put("averageStudyHours", avgStudy);
        twin.put("state", avgAttendance < 75 || avgQuiz < 50 ? "Needs Attention" : "Stable");
        return twin;
    }
}
