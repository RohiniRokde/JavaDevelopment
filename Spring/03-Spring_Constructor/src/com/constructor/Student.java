package com.constructor;

public class Student {

	private int rollno;
	
	private String name;
	
	private float marks;

	public Student(int rollno, String name, float marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	public int getRollno() {
		return rollno;
	}

	public String getName() {
		return name;
	}

	public float getMarks() {
		return marks;
	}

}