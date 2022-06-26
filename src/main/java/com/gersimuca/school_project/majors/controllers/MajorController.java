package com.gersimuca.school_project.majors.controllers;

import com.gersimuca.school_project.majors.enititis.Major;
import com.gersimuca.school_project.majors.services.MajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MajorController {
    @Autowired
    private MajorService majorService;

    @GetMapping("/student/major")
    public ResponseEntity<List<Major>> getAll(){
        List<Major> major = majorService.getAllClasses();
        return ResponseEntity.ok(major);
    }

    @PostMapping("/student/major")
    public ResponseEntity<Major> createClass(@RequestBody Major creatingMajor){
        return ResponseEntity.ok(majorService.createMajor(creatingMajor));
    }

    @PutMapping("/student/major")
    public ResponseEntity<Major> updateMajor(@RequestBody Major updateTheMajor){
        updateTheMajor = majorService.updateMajor(updateTheMajor);
        return ResponseEntity.ok(updateTheMajor);

    }

    @DeleteMapping("/student/major")
    public ResponseEntity<String> deleteMajor(@RequestParam Long majorId){
        String message = majorService.deleteMajor(majorId);
        return ResponseEntity.ok(message);
    }

    @GetMapping("/student/major{majorId}")
    public ResponseEntity<Major> getMajorById(@PathVariable(value = "majorId") Long majorId){
        Major classes =majorService.getMajorById(majorId);
        return ResponseEntity.ok(classes);
    }


}
