package com.gersimuca.school_project.services;

import com.gersimuca.school_project.enititis.Class;
import com.gersimuca.school_project.repositories.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassService {
    @Autowired
    private ClassRepository classRepository;

    // getting all classes of school
    public List<Class> getAllClasses(){
        List<Class> classes = classRepository.findAll();
        return classes;
    }
    // creating class
    public Class createClass(Class creatingClass){
        classRepository.save(creatingClass);
        return creatingClass;
    }
}
