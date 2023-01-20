package com.Masai.Controller;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandlerClass {

	
	
    @ExceptionHandler(RuntimeException.class)	
	public ResponseEntity<ErrorDetail> myExcetionHandler(RuntimeException argumentException,WebRequest request){
		
    	ErrorDetail detail=new ErrorDetail(LocalDate.now(),LocalTime.now(),argumentException.getMessage(),request.getDescription(false));
    	
    	ResponseEntity<ErrorDetail> entity=new ResponseEntity<ErrorDetail>(detail,HttpStatus.BAD_GATEWAY);
    	return  entity;
	}
	
    
    @ExceptionHandler(Exception.class)	
	public ResponseEntity<ErrorDetail> myExcetionHandler(Exception exception,WebRequest request){
		
    	ErrorDetail detail=new ErrorDetail(LocalDate.now(),LocalTime.now(),exception.getMessage(),request.getDescription(false));
    	
    	ResponseEntity<ErrorDetail> entity=new ResponseEntity<ErrorDetail>(detail,HttpStatus.BAD_GATEWAY);
    	return  entity;
	}
    
    

    
    
    
 
    
  
	
    
    
}
