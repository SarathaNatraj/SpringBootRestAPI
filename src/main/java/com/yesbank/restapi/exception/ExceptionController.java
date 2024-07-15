package com.yesbank.restapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {
	
	
	@ExceptionHandler(EmployeeNotFoundException.class)
	 public ResponseEntity<?> employeeNotFound(EmployeeNotFoundException ix){
		 return new ResponseEntity<>(ix, HttpStatus.BAD_REQUEST); 
		}
	 

}
