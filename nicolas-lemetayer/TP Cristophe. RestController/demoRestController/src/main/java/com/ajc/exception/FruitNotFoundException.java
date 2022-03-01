package com.ajc.exception;

public class FruitNotFoundException extends RuntimeException {
    public FruitNotFoundException(String message) {
        super(message);
    }
    public FruitNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
    public FruitNotFoundException(Throwable cause) {
        super(cause);
    }
}
