package com.Masai.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandlerClass {

	
	
    @ExceptionHandler(RuntimeException.class)	
	public ResponseEntity<String> myExcetionHandler(RuntimeException argumentException){
		
    	ResponseEntity<String> entity=new ResponseEntity<String>(argumentException.getMessage(),HttpStatus.BAD_REQUEST);
    	return  entity;
	}
	
    
    
    @ExceptionHandler(UserDefinedException.class)	
	public ResponseEntity<String> myExcetionHandler1(UserDefinedException argumentException){
		
    	ResponseEntity<String> entity=new ResponseEntity<String>(argumentException.getMessage(),HttpStatus.BAD_REQUEST);
    	return  entity;
	}
    
}
