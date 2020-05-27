package com.lms.project.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String firstName; 
	private String lastName;
	private String email; 
	private String imageUrl = "image.jpg";
	private float gpa;
	
//	Default Constructor is mandatory.
	public Student() {}
	
	public Student(String firstName, String lastName, String email, float gpa, String imageUrl) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.imageUrl = imageUrl; 
		this.gpa = gpa;
	}
	
	
	public Student(String firstName, String lastName, String email, float gpa) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gpa = gpa;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getImageUrl() {
		return imageUrl;
	}


	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}


	public float getGpa() {
		return gpa;
	}


	public void setGpa(float gpa) {
		this.gpa = gpa;
	}


	public Long getId() {
		return id;
	}
	
}
