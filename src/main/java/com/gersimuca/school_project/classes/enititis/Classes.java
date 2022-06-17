package com.gersimuca.school_project.classes.enititis;

import com.gersimuca.school_project.students.enititis.StudentClass;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "classes")
public class Classes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "classes_id")
    private Long classesId;

    @Column(name ="class_name", unique = true)
    private String className;

    public Long getClassesId() {
        return classesId;
    }

    public void setClassesId(Long classesId) {
        this.classesId = classesId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className.toUpperCase();
    }


    public Classes(){}
}
