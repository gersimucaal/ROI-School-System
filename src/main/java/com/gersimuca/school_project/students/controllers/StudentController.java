package com.gersimuca.school_project.students.controllers;

import com.gersimuca.school_project.students.enititis.StudentClass;
import com.gersimuca.school_project.students.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/students")
    public ResponseEntity<StudentClass> createStudent(@RequestBody StudentClass studentClass){
        return ResponseEntity.ok(studentService.createStudent(studentClass));
    }

    @GetMapping("/students")
    public ResponseEntity<List<StudentClass>> getAll(){
        List<StudentClass> studentClasses = studentService.getAllStudents();
        return ResponseEntity.ok(studentClasses);
    }

    @PutMapping("/students")
    public ResponseEntity<StudentClass> updateStudent(@RequestBody StudentClass studentClass){
        studentClass = studentService.updateStudent(studentClass);
        return ResponseEntity.ok(studentClass);
    }

    @DeleteMapping("/students")
    public ResponseEntity<String> deleteStudent(@RequestParam Long studentId){
        String message = studentService.deleteStudent(studentId);
        return ResponseEntity.ok(message);
    }

    @GetMapping("/students{studentId}")
    public ResponseEntity<StudentClass> getStudentById(@PathVariable (value = "studentId") Long studentId){
        StudentClass studentClass = studentService.getStudentById(studentId);
        return ResponseEntity.ok(studentClass);
    }

}
