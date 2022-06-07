package com.gersimuca.school_project.enititis;

import javax.persistence.*;

@Entity
@Table(name = "classes")
public class Klase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "class_id")
    private Long classId;
}
