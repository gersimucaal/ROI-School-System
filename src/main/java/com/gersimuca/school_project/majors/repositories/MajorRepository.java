package com.gersimuca.school_project.majors.repositories;

import com.gersimuca.school_project.majors.enititis.Major;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MajorRepository extends JpaRepository<Major, Long> {
    Major findMajorByMajorId(Long majorId);

}
