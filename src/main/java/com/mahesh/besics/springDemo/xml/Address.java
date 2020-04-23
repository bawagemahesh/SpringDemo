package com.mahesh.besics.springDemo.xml;

public class Address {

	String city;
	
	public Address() {
		super();
	}


	public Address(String city) {
		super();
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	


	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}


	public void setCity(String city) {
		this.city = city;
	}
	
}
