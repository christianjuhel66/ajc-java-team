package com.ecole.demo.stagiaire.exception;

public class StagiaireNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public StagiaireNotFoundException(String message) {
		super(message);
	}
	
	public StagiaireNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public StagiaireNotFoundException(Throwable cause) {
		super(cause);
	}

}
