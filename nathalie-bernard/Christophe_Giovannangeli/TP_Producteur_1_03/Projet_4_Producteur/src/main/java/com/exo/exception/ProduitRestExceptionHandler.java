package com.exo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.exo.entities.ProduitErrorResponse;

@ControllerAdvice
public class ProduitRestExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<ProduitErrorResponse> handleException(ProduitNotFoundException e) {
		ProduitErrorResponse error = new ProduitErrorResponse();
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(e.getMessage());
		error.setTimeStamp(System.currentTimeMillis());
		
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
	
	//gere les autrers exceptions
	@ExceptionHandler
	public ResponseEntity<ProduitErrorResponse> handleException(Exception e) {
		ProduitErrorResponse error = new ProduitErrorResponse();
		error.setStatus(HttpStatus.BAD_REQUEST.value());
		error.setMessage(e.getMessage());
		error.setTimeStamp(System.currentTimeMillis());
		
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
}
