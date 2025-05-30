package com.braindata.bankmanagement.model;

public class Account {
	
	private int accNo;
	private String name;
	private String mobNo;
	private String adharNo;
	private String gender;
	private int age;
	private double balance;
	
	public Account(int accNo, String name, String mobNo, String adharNo, String gender, int age, double balance) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.mobNo = mobNo;
		this.adharNo = adharNo;
		this.gender = gender;
		this.age = age;
		this.balance = balance;
		
		
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	public String getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	

}
