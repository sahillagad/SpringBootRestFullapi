package com.Masai.Controller;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Masai.bean.Department;
import com.Masai.bean.Employee;

import jakarta.annotation.PostConstruct;

@RestController
public class MyController {

	

	
	@GetMapping("/Employee")
	public Employee  getEmployee() {

		 
		Employee employee=new Employee(1, "Ram",60000,Department.SALES);
		return employee;
		
	}
	
	
	
	
	@PostMapping("/Employee")
	public Employee  SaveEmployee(@RequestBody Employee employee) {

		 
		return employee;
		
	}
	
	
	
	
	
	
}
