package com.lms.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lms.project.models.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	Student findStudentById(Long id);
}


