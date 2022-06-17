package com.gersimuca.school_project.students.repositories;

import com.gersimuca.school_project.classes.enititis.Classes;
import com.gersimuca.school_project.students.enititis.StudentClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<StudentClass, Long> {
    StudentClass findStudentClassByStudentId(Long studentId);

}
