package com.Annotation.Test.Class;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("${student.rollno}")
	private int rollno;
	
	@Value("${student.name}")
	private String name;
	
	@Value("${student.marks}")
	private float marks;
	
	public int getRollno() {
		return rollno;
	}
	
	
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	

}
