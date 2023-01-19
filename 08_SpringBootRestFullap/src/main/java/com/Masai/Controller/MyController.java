package com.Masai.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	
	
	@GetMapping("/Student/{roll}")
	public Student getStudentByRoll(@PathVariable("roll") Integer roll) {
	
		
		for(Student student:students) {
			if(student.getRoll()==roll) {
				return student;
			}
		}
		return null;
	}
	
	
	@PostMapping("/Student/{roll}")
	public Student getStudentByRoll1(@PathVariable("roll") Integer roll) {
	
		
		for(Student student:students) {
			if(student.getRoll()==roll) {
				return student;
			}
		}
		return null;
	}
	
	
}
