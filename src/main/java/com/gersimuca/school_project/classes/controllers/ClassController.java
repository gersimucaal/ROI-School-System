package com.gersimuca.school_project.classes.controllers;

import com.gersimuca.school_project.classes.enititis.Classes;
import com.gersimuca.school_project.classes.services.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ClassController {
    @Autowired
    private ClassService classService;

    @GetMapping("/classes")
    public ResponseEntity<List<Classes>> getAll(){
        List<Classes> classes = classService.getAllClasses();
        return ResponseEntity.ok(classes);
    }

    @PostMapping("/classes")
    public ResponseEntity<Classes> createClass(@RequestBody Classes creatingClass){
        return ResponseEntity.ok(classService.createClass(creatingClass));
    }

    @PutMapping("/classes")
    public ResponseEntity<Classes> updateClass(@RequestBody Classes updateTheClass){
        updateTheClass = classService.updateClass(updateTheClass);
        return ResponseEntity.ok(updateTheClass);

    }

    @DeleteMapping("/classes")
    public ResponseEntity<String> deleteClass(@RequestParam Long classesId){
        String message = classService.deleteClass(classesId);
        return ResponseEntity.ok(message);
    }

    @GetMapping("/classes{classesId}")
    public ResponseEntity<Classes> getClassById(@PathVariable(value = "classesId") Long classesId){
        Classes classes =classService.getClassById(classesId);
        return ResponseEntity.ok(classes);
    }


}
