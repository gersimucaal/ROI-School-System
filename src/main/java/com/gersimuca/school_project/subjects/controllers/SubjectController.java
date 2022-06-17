package com.gersimuca.school_project.subjects.controllers;

import com.gersimuca.school_project.subjects.enititis.Subject;
import com.gersimuca.school_project.subjects.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class SubjectController {
    @Autowired
    private SubjectService subjectService;

    // create subject
    @PostMapping("/subject")
    public ResponseEntity<Subject> createSubject(@RequestBody Subject subject){
        return ResponseEntity.ok(subjectService.createSubject(subject));
    }
    // get all subjects
    @GetMapping("/subject")
    public ResponseEntity <List<Subject>> getALlSubjects(){
        List<Subject> subjects = subjectService.getAllSubjects();
        return ResponseEntity.ok(subjects);
    }
    // update subject
    @PutMapping("/subject")
    public ResponseEntity<Subject> updateSubject(@RequestBody Subject subject){
        subject = subjectService.updateSubject(subject);
        return ResponseEntity.ok(subject);
    }
    // delete subject
    @DeleteMapping("/subject")
    public ResponseEntity<String> deleteSubject(@RequestParam Long subjectId){
        String message = subjectService.deleteSubject(subjectId);
        return ResponseEntity.ok(message);
    }
    // select subject by ID
    @GetMapping("/subject{subjectId}")
    public ResponseEntity<Subject> getSubjectById(@PathVariable ( value = "subjectId") Long subjectId){
        Subject subject = subjectService.getSubjectById(subjectId);
        return ResponseEntity.ok(subject);
    }


}
