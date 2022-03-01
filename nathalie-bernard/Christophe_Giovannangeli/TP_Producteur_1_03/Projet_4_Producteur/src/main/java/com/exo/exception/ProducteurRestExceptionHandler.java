package com.exo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.exo.entities.ProducteurErrorResponse;

@ControllerAdvice
public class ProducteurRestExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<ProducteurErrorResponse> handleException(ProducteurNotFoundException e) {
		ProducteurErrorResponse error = new ProducteurErrorResponse();
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(e.getMessage());
		error.setTimeStamp(System.currentTimeMillis());
		
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
	
	//gere les autrers exceptions
	@ExceptionHandler
	public ResponseEntity<ProducteurErrorResponse> handleException(Exception e) {
		ProducteurErrorResponse error = new ProducteurErrorResponse();
		error.setStatus(HttpStatus.BAD_REQUEST.value());
		error.setMessage(e.getMessage());
		error.setTimeStamp(System.currentTimeMillis());
		
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
}
