package com.Masai.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Masai.bean.Address;
import com.Masai.bean.Student;

@RestController
public class MyController {

	
	
	@RequestMapping("/Students")
	public List<Student> getlistOFStudent() {
		
		List<Student> list=new ArrayList<>();
		
		list.add(new Student(1, "Sahil", 567,new Address("MH","Mumbai","43213")));
		list.add(new Student(2, "Ram", 667,new Address("MH","Mumbai","43213")));
		list.add(new Student(3, "Raj", 367,new Address("MH","Mumbai","43213")));
		list.add(new Student(4, "Rani", 467,new Address("MH","Mumbai","43213")));

		
		
		
            return list;
	}
	
	
	
	
	
	
}
