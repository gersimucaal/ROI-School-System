package com.gersimuca.school_project.services;

import com.gersimuca.school_project.enititis.Classes;
import com.gersimuca.school_project.repositories.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassService {
    @Autowired
    private ClassRepository classRepository;

    // getting all classes of school
    public List<Classes> getAllClasses(){
        List<Classes> classes = classRepository.findAll();
        return classes;
    }
    // creating class
    public Classes createClass(Classes creatingClass){
       return classRepository.save(creatingClass);

    }
}
