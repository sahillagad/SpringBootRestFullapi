package com.Masai.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Masai.Bean.Student;
import com.Masai.Bean.StudentDto;

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
	public ResponseEntity<Student> getStudentById(@PathVariable("roll") Integer roll) {
	    Student s1=null;
		boolean b=true;
		for(Student student:studentds) {
			
			if(student.getRoll()==roll) {
				
				s1=student;
	         break;	
			}
			
		}
		if(s1==null) {
	 
			 throw new IllegalArgumentException("Student Is Not Found");	
		}
		
		HttpHeaders headers=new HttpHeaders();
		headers.add("User", s1.getName());
		headers.add("Address", s1.getAddress());
		ResponseEntity<Student> entity=new ResponseEntity<>(s1,headers,HttpStatus.ACCEPTED)	;
	     return entity;	
		
	}
	
//	http://localhost:8888/Students
	@GetMapping("/Students")
	public 	ResponseEntity<List<Student>> getListOfStudent(){
		
		HttpHeaders headers=new HttpHeaders();
		headers.add("User", "Sahil");
		headers.add("Address", "Mumbai");
		ResponseEntity<List<Student>> entity=new ResponseEntity<>(studentds,HttpStatus.ACCEPTED)	;
	  
	
		return entity;
	}
	
	
	
	
//	http://localhost:8888/Students
	@PostMapping("/Students")
	public String addStudent(@RequestBody Student student) {
		
		studentds.add(student);
		
		return student.getName()+"Add Successfully";
	}
	
	
	@PutMapping("/Students/{roll}/{marks}")
	public ResponseEntity<String> addMarkes(@PathVariable("roll") Integer roll,@PathVariable("marks") Integer marks) {
		
		
	for(Student student:studentds) {
			
			if(student.getRoll()==roll) {
				
				
				student.setMarks(student.getMarks()+marks);
				
				
				
				HttpHeaders headers=new HttpHeaders();
				headers.add("User", "Sahil");
				headers.add("Address", "Mumbai");
			    String result=student.getName()+" Marks is add Succrssfully "+student.getMarks();	
				ResponseEntity<String> entity=new ResponseEntity<>(result,HttpStatus.ACCEPTED)	;
			  
			
				return entity;
			}
			
		}
		return null;

	}
	
//	http://localhost:8888/Student
	@PutMapping("/Student")
	public List<Student> UodateStudent(@RequestBody Student student) {
	

		 for(Student student2:studentds) {
			 
			 if(student.getRoll()==student.getRoll()) {
	             
				int index= studentds.indexOf(student2);
				 
				 studentds.set(index, student);
				 
				 return studentds;
				 
			 } 
		 }

		 return null;
	}
	
	
	
	
//	http://localhost:8888/StudentUpdate/1
	@RequestMapping(value = "/StudentUpdate/{roll}")
	public Student UpdateStudentHandler(@RequestBody Student student,@PathVariable("roll") Integer roll) {
	
		boolean b=false;

		Student student3=null; 
     for(Student student2:studentds) {
    	
   
    	 if(student2.getRoll()==roll) {
    		 student2.setName(student.getName());
    		 student2.setMarks(student.getMarks());
 
    		 
    		 b=true;
    		 student3=student2;
             
    	 }
    }
	
	
     if(b==false) {
    	throw  new IllegalArgumentException("Student Is Not Found.....");
     }
    
	 
	return student3;
	}
	
	
//	http://localhost:8888/StudentDto?roll=1
	@GetMapping("/StudentDto")
	public StudentDto getStudentDto(@RequestParam("roll") Integer roll) {
		
	
		for(Student student:studentds) {
			if(student.getRoll()==roll) {
			
				StudentDto dto=new StudentDto(student.getName(),student.getMarks());
				
            	return dto;			
			  }
		}
		
		
		return null;
	}
 	
	
//	http://localhost:8888/Students/1
	@DeleteMapping("/Students/{roll}")
	public String DeleteStudent(@PathVariable("roll") Integer roll) {
	String result="Student Is Not Delete";	
		
		for(Student student:studentds) {
			if(student.getRoll()==roll) {
			
				studentds.remove(student); 
				result="Delete Student Successfully..";	
				
			  }
		}
		 
 	
		return result;
	}
	
	
	
	
	
	
	@DeleteMapping("/StudentsDelete/{roll}")
	public List<Student> DeleteStudenthandler(@PathVariable("roll") Integer roll) {
		
        boolean result=false; 
		
		for(Student student:studentds) {
			if(student.getRoll()==roll) {
			
				
				studentds.remove(student); 
				result=true;
				return studentds;
				
			  }
		}
		 
 	if(result==false) {
 		
    	throw  new IllegalArgumentException("Student Is Not Found.....");
		
 	}
 	
 	return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
