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

    public List<Class> getAllClasses(){
        List<Class> classes = classRepository.findAll();
        return classes;
    }
}