package com.ajc.exception;

public class FruitNotCompleteException extends RuntimeException {
    public FruitNotCompleteException(String message) {
        super(message);
    }
    public FruitNotCompleteException(String message, Throwable cause) {
        super(message, cause);
    }
    public FruitNotCompleteException(Throwable cause) {
        super(cause);
    }
}
