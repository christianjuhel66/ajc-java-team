package com.tp.formation.exception;

import com.tp.formation.entity.CoursErreurResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class CoursRestExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<CoursErreurResponse> handleException(CoursNotFoundException e) {
        CoursErreurResponse error = new CoursErreurResponse();
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(e.getMessage());
        error.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<CoursErreurResponse> handleException(Exception e) {
        CoursErreurResponse error = new CoursErreurResponse();
        error.setStatus(HttpStatus.BAD_REQUEST.value());
        error.setMessage(e.getMessage());
        error.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}
