package com.ecole.stagiaires.exceptions;

public class StagiaireNotFoundException extends RuntimeException 
{
	private static final long serialVersionID = 1L;
	public StagiaireNotFoundException(String message) {
		super(message);
	}
	
	public StagiaireNotFoundException(String message,Throwable cause)
	{
		super(message,cause);
	}
	
	public StagiaireNotFoundException(Throwable cause) {
		super(cause);
	}
}
