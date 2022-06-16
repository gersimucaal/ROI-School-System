package com.gersimuca.school_project.subjects.services;

import com.gersimuca.school_project.subjects.repositories.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectService {
    @Autowired
    private SubjectRepository subjectRepository;


}
