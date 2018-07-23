package com.thbs.mis.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.thbs.mis.exception.ErrorResponse;
import com.thbs.mis.exception.UserNotFoundException;

/**
 * Title : ExceptionControllerAdvice
 * 
 * @author Nibedita Panda
 * @date 17-June-2016
 * Description : This class contains Exception Handlers methods for the application.
 *  
 * */

@ControllerAdvice
public class ExceptionControllerAdvice {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> exceptionHandler(Exception ex) {
		System.out.println("Entering exceptionHandler for Exception");
		ErrorResponse error = new ErrorResponse();
		error.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		error.setMessage("Please contact your administrator");
		return new ResponseEntity<ErrorResponse>(error, HttpStatus.OK);
	}
	
	@ExceptionHandler(IOException.class)
	public ResponseEntity<ErrorResponse> fileNotFoundExceptionHandler(Exception ex) {
		System.out.println("Entering fileNotFoundExceptionHandler");
		ErrorResponse error = new ErrorResponse();
		error.setErrorCode(HttpStatus.NOT_FOUND.value());
		error.setMessage("File not ... please contact");
		return new ResponseEntity<ErrorResponse>(error, HttpStatus.OK);
	}
	
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<ErrorResponse> userNotFoundException(Exception ex) {
		System.out.println("inside userNotFoundException");
		ErrorResponse error = new ErrorResponse();
		error.setErrorCode(HttpStatus.PRECONDITION_FAILED.value());
		error.setMessage(ex.getMessage());
		return new ResponseEntity<ErrorResponse>(error, HttpStatus.OK);
	}
	
}