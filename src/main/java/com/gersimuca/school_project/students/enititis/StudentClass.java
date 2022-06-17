package com.gersimuca.school_project.students.enititis;

import com.gersimuca.school_project.classes.enititis.Classes;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

@Entity
@Table(name = "students")
public class StudentClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Long studentId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName.toUpperCase();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName.toUpperCase();
    }


    public StudentClass(){}
}
