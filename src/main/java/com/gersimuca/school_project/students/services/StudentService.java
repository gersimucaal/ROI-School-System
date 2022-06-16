package com.gersimuca.school_project.students.services;

import com.gersimuca.school_project.students.enititis.StudentClass;
import com.gersimuca.school_project.students.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<StudentClass> getAllStudents(){
        List<StudentClass> studentClasses = studentRepository.findAll();
        return studentClasses;
    }

    public StudentClass createStudent(StudentClass studentClass){
        return studentRepository.save(studentClass);
    }

    public StudentClass updateStudent(StudentClass studentClass){
        if(studentClass.getStudentId() == null){
            return  null;
        } else if(studentRepository.findStudentClassByStudentId(studentClass.getStudentId()) == null) {
            return null;
        } else {
            studentRepository.save(studentClass);
            return studentClass;
        }
    }

    public String deleteStudent(Long studentId){
        studentRepository.deleteById(studentId);
        return "Student has been deleted";
    }

    public StudentClass getStudentById(Long id){
        Optional<StudentClass> studentClass = studentRepository.findById(id);
        if(studentClass.isPresent()) return studentClass.get();
        else return null;
    }

}
