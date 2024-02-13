package com.los;

import java.util.ArrayList;






public class Root {

	
	
	private  String Name;
	
	private  int age;
	 
	private boolean Staus;
	
	private Address address;
	
	private ArrayList<String> courses;
	
	
	
	
	
	

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isStaus() {
		return Staus;
	}

	public void setStaus(boolean staus) {
		Staus = staus;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public ArrayList<String> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<String> courses) {
		this.courses = courses;
	}

	public Root(String name, int age, boolean staus, Address address, ArrayList<String> courses) {
		super();
		Name = name;
		this.age = age;
		Staus = staus;
		this.address = address;
		this.courses = courses;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
