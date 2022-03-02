package com.formation.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.formation.entity.CoursErrorResponse;

@ControllerAdvice
public class CoursRestExceptionHandler {
	@ExceptionHandler
	public ResponseEntity<CoursErrorResponse> handleException(CoursNotFoundException e) {
		CoursErrorResponse error = new CoursErrorResponse();
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(e.getMessage());
		error.setTimeStamp(System.currentTimeMillis());

		return new ResponseEntity(error, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler
	public ResponseEntity<CoursErrorResponse> handleException(Exception e) {
		CoursErrorResponse error = new CoursErrorResponse();
		error.setStatus(HttpStatus.BAD_REQUEST.value());
		error.setMessage(e.getMessage());
		error.setTimeStamp(System.currentTimeMillis());

		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
}
