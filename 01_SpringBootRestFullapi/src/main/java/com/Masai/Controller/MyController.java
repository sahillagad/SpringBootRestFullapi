package com.Masai.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.Media;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Masai.bean.Student;

@RestController
public class MyController {

	
	
	@RequestMapping(value =  "/Students",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Student> getlistOFStudent() {
		
		List<Student> list=new ArrayList<>();
		
		list.add(new Student(1, "Sahil", 567));
		list.add(new Student(2, "Ram", 555));
		list.add(new Student(3, "Rani", 667));
		list.add(new Student(4, "Tom", 347));
          
		
            return list;
	}
	
	
	
	
	
	@RequestMapping(value = "/Student",produces = MediaType.APPLICATION_JSON_VALUE)
	public Student getStudent() {
				
	Student student=new Student(1, "Sahil", 567);
		
          
		
            return student;
	}
	
	
	
	
	
	
}
