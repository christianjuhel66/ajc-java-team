package com.tp.formation.exception;

public class CoursNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public CoursNotFoundException(String message) {
        super(message);
    }

    public CoursNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public CoursNotFoundException(Throwable cause) {
        super(cause);
    }
}
