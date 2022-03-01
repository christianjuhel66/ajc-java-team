package com.ecole.stagiaires.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ecole.stagiaires.entities.StagiaireErrorResponse;

@ControllerAdvice

public class StagiaireRestExceptionHandler {
	
	@ExceptionHandler
	public ResponseEntity <StagiaireErrorResponse> handleException (StagiaireNotFoundException e){
		StagiaireErrorResponse error = new StagiaireErrorResponse();
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(e.getMessage());
		error.setTimeStamp(System.currentTimeMillis());
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
	//ajouter une autre exception handler pour gerer les autres exceptions (catch all)
	@ExceptionHandler
	public ResponseEntity <StagiaireErrorResponse> handleException(Exception e){
		StagiaireErrorResponse error = new StagiaireErrorResponse();
		error.setStatus(HttpStatus.BAD_REQUEST.value());
		error.setMessage(e.getMessage());
		error.setTimeStamp(System.currentTimeMillis());
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}	
}
