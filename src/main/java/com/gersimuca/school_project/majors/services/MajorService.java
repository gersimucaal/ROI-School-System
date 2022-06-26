package com.gersimuca.school_project.majors.services;

import com.gersimuca.school_project.majors.enititis.Major;
import com.gersimuca.school_project.majors.repositories.MajorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MajorService {
    @Autowired
    private MajorRepository majorRepository;

    // getting all classes of school
    public List<Major> getAllClasses(){
        List<Major> major = majorRepository.findAll();
        return major;
    }
    public Major createMajor(Major creatingMajor){
       return majorRepository.save(creatingMajor);

    }
    public Major updateMajor(Major updateTheMajor){
        if(updateTheMajor.getMajorId() == null) {
            return null;
        }
            else if(majorRepository.findMajorByMajorId(updateTheMajor.getMajorId()) == null){
                return null;
            }
            else {
                majorRepository.save(updateTheMajor);
                return updateTheMajor;
        }
    }

    public String deleteMajor(Long majorId){
        majorRepository.deleteById(majorId);
        return "Class has been deleted";
    }

    public Major getMajorById(Long id){
        Optional<Major> major = majorRepository.findById(id);
        if(major.isPresent()) return major.get();
        else return null;
    }

}
