package com.byConstructor;

public class Address {
	private String cityname;
	
	private String areaname;

	public Address(String cityname, String areaname) {
		super();
		this.cityname = cityname;
		this.areaname = areaname;
		
		
	}

	public String getCityname() {
		return cityname;
	}

	public String getAreaname() {
		return areaname;
	}

}
	