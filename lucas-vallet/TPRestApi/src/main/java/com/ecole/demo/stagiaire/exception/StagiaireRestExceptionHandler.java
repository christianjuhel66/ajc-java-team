package com.ecole.demo.stagiaire.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ecole.demo.stagiaire.entity.StagiaireErreurResponse;

@ControllerAdvice
public class StagiaireRestExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<StagiaireErreurResponse> handleException(EmployeNotFoundException e) {
		StagiaireErreurResponse error = new StagiaireErreurResponse();
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(e.getMessage());
		error.setTimeStamp(System.currentTimeMillis());
		
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
	
	// ajouter un autre exception handler pour gérer les autres exceptions (catch all)
	@ExceptionHandler
	public ResponseEntity<StagiaireErreurResponse> handleException(Exception e){
		StagiaireErreurResponse error = new StagiaireErreurResponse();
		error.setStatus(HttpStatus.BAD_REQUEST.value());
		error.setMessage(e.getMessage());
		error.setTimeStamp(System.currentTimeMillis());
		
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
}
