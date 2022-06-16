package com.gersimuca.school_project.subjects.enititis;

import com.gersimuca.school_project.students.enititis.StudentClass;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name ="subjects")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="subject_id")
    private Long subjectId;

    @Column(name = "name")
    private String name;

    @ManyToMany
    @JoinTable( name = "student_enrolled",
            joinColumns = @JoinColumn(name = "subject_id"),
            inverseJoinColumns = @JoinColumn(name ="student_id"))

    private Set<StudentClass> enrolledStudents = new HashSet<>();

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.toUpperCase();
    }

    public Set<StudentClass> getEnrolledStudents() {
        return enrolledStudents;
    }

    public Subject(){}
}
