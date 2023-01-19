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

import com.Masai.bean.Customer;

import jakarta.annotation.PostConstruct;

@RestController
public class MyController {

	List<Customer> customers=new ArrayList<>();
	
	@PostConstruct
	public void initMethod() {
		
		customers.add(new Customer(1, "Ram", "MUmbai"));
		customers.add(new Customer(2, "Rani", "Nashik"));
		customers.add(new Customer(3, "Tom", "Ahmadnagar"));
		customers.add(new Customer(4, "Raj", "Akola"));
		customers.add(new Customer(5, "Jarray", "Pune"));
		customers.add(new Customer(6, "Sahil", "Satara"));
		
		
	}
	
//	http://localhost:8888/Customer?Id=1
	@GetMapping("/Customer")
	public Customer getCustomer(@RequestParam("Id") Integer id ) {
		
		for(Customer customer:customers ){
		
			if(customer.getId()==id) {
				
				return customer;
			}
			
		}
		
     		return null;
	}
	
	
//	http://localhost:8888/Customers
	@GetMapping("/Customers")
	public  List<Customer> getCustomer() {

     		return customers;
	}
	
	
//	http://localhost:8888/Customer
	@PostMapping("/Customer")
	public  List<Customer> addCustomer(@RequestBody Customer customer) {
		
	    customers.add(customer);	
	
	    return customers;
	}
	
// 
	@RequestMapping(value = "/Customers",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public  String addCustomer1(@RequestBody Customer customer) {
		
	    customers.add(customer);	
	
	    return customers+" Customer Successfully Add";
	}
	
	
}
