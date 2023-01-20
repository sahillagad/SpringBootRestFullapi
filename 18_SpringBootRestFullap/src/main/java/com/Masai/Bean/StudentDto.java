package com.Masai.Bean;

public class StudentDto {

private String name;
private Integer marks;
public StudentDto(String name, Integer marks) {
	super();
	this.name = name;
	this.marks = marks;
}
public StudentDto() {
	super();
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
@Override
public String toString() {
	return "StudentDto [name=" + name + ", marks=" + marks + "]";
}

	
	
}
