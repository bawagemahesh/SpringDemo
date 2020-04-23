package com.mahesh.besics.springDemo.xml;

public class Customer {

	private Address address;
	private String name;

	public Customer() {
		super();
	}

	public Customer(Address address, String name) {
		super();
		this.address = address;
		this.name = name;

	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + "]";
	}

}
