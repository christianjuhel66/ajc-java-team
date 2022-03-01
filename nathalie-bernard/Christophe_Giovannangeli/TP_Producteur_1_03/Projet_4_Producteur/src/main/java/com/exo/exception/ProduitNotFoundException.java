package com.exo.exception;

public class ProduitNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ProduitNotFoundException(String message) {
		super(message);
	}
	
	public ProduitNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public ProduitNotFoundException(Throwable cause) {
		super(cause);
	}

}
