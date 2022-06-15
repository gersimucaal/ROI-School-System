package com.gersimuca.school_project.repositories;

import com.gersimuca.school_project.enititis.StudentClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentClass, Long> {

}
