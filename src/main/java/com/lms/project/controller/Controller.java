package com.lms.project.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lms.project.models.Student;
import com.lms.project.service.StudentService;

@RestController
public class Controller {
	
	@Autowired
	StudentService studentService;
	
	
//	@GetMapping("/")
//	public Student index() {
//		Student student = studentService.createStudent();
//		return student;
//	}
	
	@GetMapping("/")
	public String index() {
		return "Hello Again Sayeed";
	}
	
	
	@GetMapping("/api/student")
	public List<Student> getStudents() {
		return studentService.findAll();
	}
	
	@PostMapping("/api/student")
	public void postStudent(Student student){
		studentService.createStudent(student);
	}
}
