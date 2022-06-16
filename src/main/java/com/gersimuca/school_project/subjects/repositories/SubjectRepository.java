package com.gersimuca.school_project.subjects.repositories;

import com.gersimuca.school_project.students.enititis.StudentClass;
import com.gersimuca.school_project.subjects.enititis.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {
    Subject findSubjectBySubjectId(Long subjectId);
}