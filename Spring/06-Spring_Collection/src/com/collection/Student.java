package com.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

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

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Set<String> getMails() {
		return mails;
	}

	public void setMails(Set<String> mails) {
		this.mails = mails;
	}

	public Map<String, Double> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, Double> courses) {
		this.courses = courses;
	}

	private int rollno;
	
	private String name;
	
	private List <String> friends;
	
	private Set <String> mails;
	
	private Map<String,Double> courses;
	
	
	
}
