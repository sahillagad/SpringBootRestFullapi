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
	
	 
	
	@GetMapping("/student")
	public Student getStudent(@RequestParam("roll")Integer StudentRoll) {
		
	
		for(Student student:students) {
			
			if(student.getRoll()==StudentRoll) {
			return student;
			}
		}
		return null;
		
	}
	
	
	
	@GetMapping("/students")
	public Student getStudentHandler1(@RequestParam("roll")Integer StudentRoll,@RequestParam("name")String StudentName) {
		
	
		Student student=new Student(StudentRoll, StudentName,675);
	return student;
		
	
	}

	
	
	
	@GetMapping("/studentes")
	public Student getStudentHandler1(@RequestParam("roll")Integer StudentRoll,@RequestParam( value = "name" ,required = false)String StudentName,@RequestParam("marks")Integer marks) {
		
		
		Student student=new Student(StudentRoll, StudentName,marks);
	     return student;
		
	
	}
	
	
}
