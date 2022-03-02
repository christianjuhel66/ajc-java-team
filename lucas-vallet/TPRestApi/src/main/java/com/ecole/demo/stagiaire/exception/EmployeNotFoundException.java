package com.ecole.demo.stagiaire.exception;

public class EmployeNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public EmployeNotFoundException(String message) {
		super(message);
	}
	
	public EmployeNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public EmployeNotFoundException(Throwable cause) {
		super(cause);
	}

}