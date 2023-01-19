package com.Masai.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Masai.Bean.Employee;

import jakarta.annotation.PostConstruct;

@RestController
public class MyController {

	 
	List<Employee> employees=new ArrayList<>();
	
	@PostConstruct
	public void initMethod() {
		
		employees.add(new Employee(1, "Ram", "Mumbai",45000));
		employees.add(new Employee(2, "Rani", "Kalyan",70000));
		employees.add(new Employee(3, "Raj", "Nashik",60000));
		employees.add(new Employee(4, "Tom", "Pune",55000));
		employees.add(new Employee(5, "Karathi", "Mumbai",34000));
		
		
	}
	
	
	
	@GetMapping("/Employees")
	public List<Employee>  getemployeeList() {
	
		return employees;
	}
	
	@GetMapping("/Employee/{id}")
	public Employee getEmployeeById(@PathVariable("id") Integer emplId) {
		
		
		for(Employee employee :employees) {
			
			if(employee.getEmpId()==emplId) {
				
				
				return employee;
			}	
		}
		return null;
	}
	
	
	@GetMapping("/Employee/{id}/{name}/{add}/{salary}")
	public Employee getEmployeeB(@PathVariable("id") Integer emplId,@PathVariable("name")String name,@PathVariable("add")String add,@PathVariable("salary")Integer salary) {	
	 return new Employee(emplId, name, add, salary);

	 
	}
	
	@GetMapping("/Employees/{i}/{n}/{a}/{s}")
	public Employee getEmployeeBy(@PathVariable("i") Integer emplId,
			@PathVariable("n")String name,
			@PathVariable("a")String add,
			@PathVariable("s")Integer salary) {	
		
		
	 return new Employee(emplId, name, add, salary);

	}
	
}
