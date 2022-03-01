package com.ajc.exception;

public class LegumeNotCompleteException extends RuntimeException {
    public LegumeNotCompleteException(String message) {
        super(message);
    }
    public LegumeNotCompleteException(String message, Throwable cause) {
        super(message, cause);
    }
    public LegumeNotCompleteException(Throwable cause) {
        super(cause);
    }
}
