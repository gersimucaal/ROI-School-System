package com.gersimuca.school_project.subjects.enititis;

import com.gersimuca.school_project.students.enititis.StudentClass;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(
        name ="subjects",
        uniqueConstraints = @UniqueConstraint(
                name = "subject_name_unique",
                columnNames = "subject_name"
        ))
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="subject_id")
    private Long subjectId;

    @Column(name = "subject_name",
            nullable = false)
    private String subjectName;


    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public String getName() {
        return subjectName;
    }

    public void setName(String name) {
        this.subjectName = name.toUpperCase();
    }


    public Subject(){}
}
