package com.lms.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.project.models.Student;
import com.lms.project.repository.StudentRepository;

@Service
public class StudentService implements StudentInterface{
	
	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public List<Student> findAll() {
		return studentRepository.findAll();
	}
	
//	@Override
//	public Student createStudent() {
//		Student student = new Student("Sayeed", "Joseph", "sayeed@lms.com", 3.5f);
//		
////		Student savedStudent = studentRepository.save(student);
//		
////		return savedStudent;
//		return student;
//	}
	
	@Override
	public void createStudent(Student student) {
		studentRepository.save(student);
	}
	
}
