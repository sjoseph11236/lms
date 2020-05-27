package com.lms.project.service;

import java.util.List;

import com.lms.project.models.Student;

public interface StudentInterface {
	
//	Student createStudent();
	void createStudent(Student student);
	List<Student> findAll();
}
