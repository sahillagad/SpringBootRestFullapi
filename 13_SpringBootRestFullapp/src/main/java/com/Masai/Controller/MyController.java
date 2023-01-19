package com.Masai.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Masai.Bean.Student;

import jakarta.annotation.PostConstruct;

@RestController
public class MyController {

	
	List<Student> students=new ArrayList<>();
	
	@PostConstruct
	public void initMethod() {
		
		students.add(new Student(1, "Sahil", 657));
		students.add(new Student(2, "Ram", 557));
		students.add(new Student(3, "Rani", 457));
		students.add(new Student(4, "Raj", 357));
		students.add(new Student(5, "Tom", 557));
		
	
	}
	
	 
	
//	http://localhost:8888/Student/1?name=Sahil
	 @GetMapping("/Student/{roll}")
	 public Student getStudent(@PathVariable("roll") Integer roll,@RequestParam("name")String name) {
		 
		 
		 Student student=new Student(roll, name,657);
		 
		 return student;
	 }
	 


//	 http://localhost:8888/Students1/1?marks=444	 
	 @GetMapping("/Students/{roll}")
	 public Student getStudent1(@PathVariable("roll") Integer roll,@RequestParam( value = "name",required = false)String name,@RequestParam("marks") Integer marks) {
		 Student student=new Student(roll, name,marks);
		 return student;
	 }
	 
	 
	 
//	 http://localhost:8888/Students1/1
	 @GetMapping("/Students1/{roll}")
	 public Student getStudent2(@PathVariable("roll") Integer roll,@RequestParam( value = "name",required = false)String name) {
		 Student student=new Student(roll, name,999);
		 return student;
	 }
	 
	 
	 
	
	 
	 
	 
	
}
