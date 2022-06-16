package com.gersimuca.school_project.classes.services;

import com.gersimuca.school_project.classes.enititis.Classes;
import com.gersimuca.school_project.classes.repositories.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClassService {
    @Autowired
    private ClassRepository classRepository;

    // getting all classes of school
    public List<Classes> getAllClasses(){
        List<Classes> classes = classRepository.findAll();
        return classes;
    }
    public Classes createClass(Classes creatingClass){
       return classRepository.save(creatingClass);

    }
    public Classes updateClass(Classes updateClass){
        if(updateClass.getClassesId() == null) {
            return null;
        }
            else if(classRepository.findClassesByClassesId(updateClass.getClassesId()) == null){
                return null;
            }
            else {
                classRepository.save(updateClass);
                return updateClass;
        }
    }

    public String deleteClass(Long classesId){
        classRepository.deleteById(classesId);
        return "Class has been deleted";
    }

    public Classes getClassById(Long id){
        Optional<Classes> classes = classRepository.findById(id);
        if(classes.isPresent()) return classes.get();
        else return null;
    }

}
