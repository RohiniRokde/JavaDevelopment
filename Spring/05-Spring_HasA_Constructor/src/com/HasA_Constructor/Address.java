package com.HasA_Constructor;

public class Address {
	
	private int pincode;
	
	private String Area;
	
	private String city;

	public Address(int pincode, String area, String city) {
		super();
		this.pincode = pincode;
		Area = area;
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public String getArea() {
		return Area;
	}

	public String getCity() {
		return city;
	}

	

}
