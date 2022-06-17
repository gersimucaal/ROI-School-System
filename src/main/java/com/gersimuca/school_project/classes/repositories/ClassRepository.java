package com.gersimuca.school_project.classes.repositories;

import com.gersimuca.school_project.classes.enititis.Classes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassRepository extends JpaRepository<Classes, Long> {
    Classes findClassesByClassName(String ClassName);
    Classes findClassesByClassesId(Long classesId);

    List<Classes>  findByClassNameContaining(String className);
}
