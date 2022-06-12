package com.gersimuca.school_project.controllers;

import com.gersimuca.school_project.enititis.Class;
import com.gersimuca.school_project.services.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ClassController {
    @Autowired
    private ClassService classService;

    @GetMapping("/get-classes")
    public ResponseEntity<List<Class>> getAll(){
        List<Class> classes = classService.getAllClasses();
        return ResponseEntity.ok(classes);
    }
}
