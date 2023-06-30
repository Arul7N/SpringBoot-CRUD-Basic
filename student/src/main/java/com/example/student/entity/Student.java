package com.example.student.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "fname" , nullable = false)
	private String fname;
	
	@Column(name = "lname")
	private String lname;
	
	@Column(name = "dept")
	private String dept;
	
	@Column(name = "email")
	private String email;
	
	public Student(String fname, String lname, String dept, String email) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.dept = dept;
		this.email = email;
	}
	

	public Student() {
		
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


	public Object getLastName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}

