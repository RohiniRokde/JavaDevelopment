package com.HasA_Constructor;

public class Student {
	
	 private int rollno;
	 
	 private String name;
	 
	 private Address add;

	public Student(int rollno, String name, Address add) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.add = add;
	}

	public int getRollno() {
		return rollno;
	}

	public String getName() {
		return name;
	}

	public Address getAdd() {
		return add;
	}

		

}
