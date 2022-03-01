package cursusRestController.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import cursusRestController.entites.CursusErreurResponse;


@ControllerAdvice
public class CursusExceptionHandler {
	
    @ExceptionHandler
    public ResponseEntity<CursusErreurResponse> handleException(Exception e){
    	CursusErreurResponse error = new CursusErreurResponse();
        error.setStatus(HttpStatus.BAD_REQUEST.value());
        error.setMessage(e.getMessage());
        error.setTimeStamp(System.currentTimeMillis());
        
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
    

}


