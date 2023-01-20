package com.Masai.Bean;

public class Student {

	
	private Integer roll;
	private String name;
	private Integer marks;
	private String address;
	public Student(Integer roll, String name, Integer marks, String address) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.address = address;
	}
	
	
	public Student() {
		super();
	}


	public Integer getRoll() {
		return roll;
	}
	public void setRoll(Integer roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", address=" + address + "]";
	}
	
	
	
	
	
}
