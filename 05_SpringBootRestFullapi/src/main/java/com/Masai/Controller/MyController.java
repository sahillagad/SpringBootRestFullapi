package com.Masai.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Masai.Bean.Employee;

@RestController
public class MyController {

	
	@GetMapping("/Employee")
	public Employee  getemployee() {
		
		return new Employee(1, "Ram", "Mumbai", 56000);
	}
	
	
	@GetMapping("/Employees")
	public List<Employee>  getemployeeList() {
		List<Employee> employees=new ArrayList<>();
		
		employees.add(new Employee(1, "Ram", "Mumbai",70000));
		employees.add(new Employee(2, "Rani", "Mumbai",70000));
		employees.add(new Employee(3, "Raj", "Mumbai",70000));
		employees.add(new Employee(4, "Tom", "Mumbai",70000));
		employees.add(new Employee(5, "Karathi", "Mumbai",70000));


		return employees;
	}
	
	
}
