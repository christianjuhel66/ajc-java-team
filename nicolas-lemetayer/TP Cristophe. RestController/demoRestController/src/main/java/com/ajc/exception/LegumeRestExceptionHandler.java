package com.ajc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class LegumeRestExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<LegumeErreurResponse> handleException(Exception e) {
        LegumeErreurResponse error = new LegumeErreurResponse();
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(e.getMessage());
        error.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<LegumeErreurResponse> handleException(LegumeNotFoundException e) {
        LegumeErreurResponse error = new LegumeErreurResponse();
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(e.getMessage());
        error.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
}
