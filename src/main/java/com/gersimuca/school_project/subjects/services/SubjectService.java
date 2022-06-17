package com.gersimuca.school_project.subjects.services;

import com.gersimuca.school_project.subjects.enititis.Subject;
import com.gersimuca.school_project.subjects.repositories.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubjectService {
    @Autowired
    private SubjectRepository subjectRepository;

    // get all subjects
    public List<Subject> getAllSubjects(){
        List<Subject>subjects = subjectRepository.findAll();
        return subjects;
    }

    // create subjects
    public Subject createSubject(Subject subject) {
        return subjectRepository.save(subject);
    }

    // update subject
    public Subject updateSubject(Subject subject){
        if(subject.getSubjectId() == null){
            return null;
        } else if(subjectRepository.findSubjectBySubjectId(subject.getSubjectId()) == null) {
            return null;
        } else {
            subjectRepository.save(subject);
            return subject;
        }

    }

    // delete subject
    public String deleteSubject (Long subjectId){
        subjectRepository.deleteById(subjectId);
        return "Subject has been deleted";
    }

    // select subject by ID
    public Subject getSubjectById(Long id){
        Optional<Subject> subject = subjectRepository.findById(id);
        if(subject.isPresent()) return subject.get();
        else return null;
    }



}
