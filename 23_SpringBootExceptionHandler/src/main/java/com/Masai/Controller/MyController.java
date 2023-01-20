package com.Masai.Controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	
	

	
	@GetMapping("/hello/{id}")
	private ResponseEntity<String> sayHello(@PathVariable("id")Integer id) {
	
		if(id>10) {
			
			HttpHeaders headers=new HttpHeaders();
			headers.add("User","Sahil");
		    headers.add("Admin","Ratan" );
			
			return new  ResponseEntity<String>("Welcome To Spring Boot",headers,HttpStatus.ACCEPTED);
		}
		else {
			throw new UserDefinedException("Invaild Id Value");
		}
	}
	
	
	
	
	
}
