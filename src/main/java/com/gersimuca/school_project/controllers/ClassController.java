package com.gersimuca.school_project.controllers;

import com.gersimuca.school_project.enititis.Classes;
import com.gersimuca.school_project.services.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class ClassController {
    @Autowired
    private ClassService classService;

    @GetMapping("/get-classes")
    public ResponseEntity<List<Classes>> getAll(){
        List<Classes> classes = classService.getAllClasses();
        return ResponseEntity.ok(classes);
    }

    @PostMapping("/create-class")
    public ResponseEntity<Classes> createClass(@RequestBody Classes creatingClass){
        return ResponseEntity.ok(classService.createClass(creatingClass));
    }
}
