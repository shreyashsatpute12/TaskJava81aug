package com.Exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {

	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Error> exceptionHandler(Exception exception) {
		Error error = new Error();
		error.setErrorMessage("SOMETHING WENT WRONG.PLEASE TRY AGAIN");
		error.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.value());  //500
		error.setTimestamp(LocalDateTime.now());
		return new ResponseEntity<Error>(error, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(ProjDetailsNotFound.class)
	public ResponseEntity<Error> infyBankExceptionHandler(ProjDetailsNotFound exception) {
		Error error = new Error();
		error.setErrorMessage(exception.getMessage());
		error.setTimestamp(LocalDateTime.now());   		
		error.setErrorCode(HttpStatus.NOT_FOUND.value());  //404
		return new ResponseEntity<Error>(error, HttpStatus.NOT_FOUND);
}
}
