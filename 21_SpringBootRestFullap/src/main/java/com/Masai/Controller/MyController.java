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

import com.Masai.Bean.Address;
import com.Masai.Bean.Employee;


import jakarta.annotation.PostConstruct;

@RestController
public class MyController {

	
	List<Employee> employees=new ArrayList<>();
	
	 
	@PostConstruct
	public void initMethod() {
	
		employees.add(new Employee(1,"Ram",21 , new Address("Kalyan","MH", "432151"),50000));
		employees.add(new Employee(2,"Raj",24 , new Address("Kalyan","MH", "432151"),45000));
		employees.add(new Employee(3,"Sahil",29 , new Address("Kalyan","MH", "432151"),44000));
		employees.add(new Employee(4,"Pramila",30 , new Address("Kalyan","MH", "432151"),34000));
		employees.add(new Employee(5,"Bhaskar",54 , new Address("Kalyan","MH", "432151"),30000));
	}
	
	
	@GetMapping("/Employees")
	public ResponseEntity<List<Employee>> getEmployeeList(){
	
		HttpHeaders headers=new HttpHeaders();
		headers.add("Admin","Ratan");
		headers.add("User", "Sahil");
		
      ResponseEntity<List<Employee>> entity=new ResponseEntity<>(employees,headers,HttpStatus.OK);		
       return entity;
	}
	
	
	
	
	@GetMapping("/Employees/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("Id") Integer employeeId){
	
		HttpHeaders headers=new HttpHeaders();
	
		Employee employee1=null;
		
		for(Employee employee:employees) {
			if(employee.getEmpId()==employeeId) {
				
				employee1=employee; 
				 break;
			}
			
			
		}
		
		if(employee1==null) {
	  
			throw new  IllegalArgumentException("Employee IS Not Found");
			
		}
	
		headers.add("Admin","Ratan");
		headers.add("User", "Sahil");
      ResponseEntity<Employee> entity=new ResponseEntity<>(employee1,headers,HttpStatus.OK);		
      return entity;
	}
	
	
	
	@PostMapping("/Employee")
	public ResponseEntity<String> addEmployee(@RequestBody Employee employee) {
 
		employees.add(employee);
		HttpHeaders headers=new HttpHeaders();
		headers.add("Admin","Ratan");
		headers.add("User", "Sahil");
      ResponseEntity<String> entity=new ResponseEntity<>("Employee Add Succesfully...",headers,HttpStatus.OK);		
		
      return entity;
	
	}
	
	
	
}
