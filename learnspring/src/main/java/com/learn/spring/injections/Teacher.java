package com.learn.spring.injections;

public class Teacher {
	
	
	private Integer id;
	private String name;
	private Address address;
	

	public Teacher(Integer id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public Teacher() {
		
	}
	
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}



	public void displayInfo() {
		System.out.println("id =" + id + "\n" + "name" + name );
		System.out.println("address" + address.toString());
	}

}
