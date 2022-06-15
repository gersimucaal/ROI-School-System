package com.gersimuca.school_project.repositories;

import com.gersimuca.school_project.enititis.Classes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRepository extends JpaRepository<Classes, Long> {
    Classes findClassesByClassName(String ClassName);
}
