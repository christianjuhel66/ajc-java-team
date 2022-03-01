package com.exo.exception;

public class ProducteurNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ProducteurNotFoundException(String message) {
		super(message);
	}
	
	public ProducteurNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public ProducteurNotFoundException(Throwable cause) {
		super(cause);
	}

}
