package com.kodnest.Firsthibernate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column
	String name;
	@Column
	int marks;
	@Column
	String email;
	
	public Student() {
		super();
	}

	public Student(String name, int mark, String email) {
		super();
		this.name = name;
		this.marks = mark;
		this.email = email;
	}

	public Student(int id, String name, int mark, String email) {
		super();
		this.id = id;
		this.name = name;
		this.marks = mark;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMark() {
		return marks;
	}

	public void setMark(int mark) {
		this.marks = mark;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", mark=" + marks + ", email=" + email + "]";
	}
}
