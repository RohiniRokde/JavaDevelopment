package com.byConstructor;

public class Student {
	
	private int rollno;
	private String name;
	private Address address;
	
	public Student(int rollno, String name, Address address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
		
	}
	
	public int getRollno() {
		return rollno;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	}

	
}
	
	