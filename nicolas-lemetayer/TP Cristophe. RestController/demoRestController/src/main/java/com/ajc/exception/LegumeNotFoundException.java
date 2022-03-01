package com.ajc.exception;

public class LegumeNotFoundException extends RuntimeException {
    public LegumeNotFoundException(String message) {
        super(message);
    }
    public LegumeNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
    public LegumeNotFoundException(Throwable cause) {
        super(cause);
    }
}
