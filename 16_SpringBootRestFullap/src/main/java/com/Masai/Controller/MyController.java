package com.Masai.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Masai.Bean.Student;

import jakarta.annotation.PostConstruct;

@RestController
public class MyController {

	
	List<Student> studentds=new ArrayList<>();
	
	 
	@PostConstruct
	public void initMethod() {
		
		studentds.add(new Student(1, "Sahil",567, "Mumbai"));
		studentds.add(new Student(2, "Ram",555, "Nashik"));
		studentds.add(new Student(3, "Rani",345, "Pune"));
		studentds.add(new Student(4, "Raj",444, "Sinnar"));
		studentds.add(new Student(5, "Tom",555, "Amadnagar"));
	          
	}
	
//	http://localhost:8888/Students/2
	@GetMapping("/Students/{roll}")
	public Student getStudentById(@PathVariable("roll") Integer roll) {
	
		for(Student student:studentds) {
			
			if(student.getRoll()==roll) {
				
				return student;
			}
			
		}
		return null;
	}
	
//	http://localhost:8888/Students
	@GetMapping("/Students")
	public List<Student> getListOfStudent(){
		
		return studentds;
	}
	
	
	
//	http://localhost:8888/Students
	@PostMapping("/Students")
	public String addStudent(@RequestBody Student student) {
		
		studentds.add(student);
		
		return student.getName()+"Add Successfully";
	}
	
	
	@PutMapping("/Students/{roll}/{marks}")
	public String addMarkes(@PathVariable("roll") Integer roll,@PathVariable("marks") Integer marks) {
		
		
	for(Student student:studentds) {
			
			if(student.getRoll()==roll) {
				
				
				student.setMarks(student.getMarks()+marks);
				
				return student.getName()+" Marks is add Succrssfully "+student.getMarks();
			}
			
		}
		return null;

	}
	
}
