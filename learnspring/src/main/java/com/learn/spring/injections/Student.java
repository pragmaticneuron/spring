package com.learn.spring.injections;

public class Student {
	
	public Student(Integer id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	private Integer id;
	private String name;
	private Address address;

	

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Student() {
		super();
	}

	public Student(int id) {
		super();
		this.id = id;
	}
	
	public Student(String name) {
		super();
		this.name = name;
	}
	
	public Student(Address address) {
		super();
		this.address = address;
	}

	public void displayInfo() {
		System.out.println("id =" + id + "\n" + "name" + name );
		System.out.println("address" + address.toString());
	}

}
