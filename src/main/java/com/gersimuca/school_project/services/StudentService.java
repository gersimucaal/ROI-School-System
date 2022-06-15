package com.gersimuca.school_project.services;

import com.gersimuca.school_project.enititis.StudentClass;
import com.gersimuca.school_project.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<StudentClass> getAllClasses(){
        List<StudentClass> students = studentRepository.findAll();
        return students;
    }

}
