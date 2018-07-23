package com.thbs.mis.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thbs.mis.exception.UserNotFoundException;
import com.thbs.mis.log.AppLog;
import com.thbs.mis.log.LogFactory;

@RestController
@RequestMapping("/user")
public class UserController {
	
	private static final AppLog LOG = LogFactory.getLog(UserController.class);
	
	@PreAuthorize("hasRole('ROLE_ALLUSERS')")
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public String getGreeting(@PathVariable String name) throws Exception {
		String result="Hello getGreeting NIBU changed the setting ddddddd "+name;	
		System.out.println("In getGreeting log new one ok");
		/*if(name.equalsIgnoreCase("Nibu"))
		{
			throw new ArithmeticException();
		}
		
		if(name.equalsIgnoreCase("Anu"))
		{
			throw new UserNotFoundException("Anu does not exists as an employee ha ha tyu");
		}
		
		if(name.equalsIgnoreCase("Sujitha"))
		{
			throw new NullPointerException("Sujitha file is not found");
		}*/
		return result;
	}
	
	
	//@PreAuthorize("hasRole('ROLE_ALLUSERS')")
	@RequestMapping(value = "/card/{name}", method = RequestMethod.GET)
	public String getGreetingCard(@PathVariable String name) throws Exception {
		String result="Hello getGreetingCard Anu "+name;	
		System.out.println("In getGreetingCard h ah aha ");
		return result;
	}
	
	
	/*Controller/Module specific exceptions can be defined here 
	or can be moved to ExceptionControllerAdvice class*/
	
	/*@ExceptionHandler(UserNotFoundException.class)
			public ResponseEntity<ErrorResponse> exceptionHandler(Exception ex) {
			ErrorResponse error = new ErrorResponse();
			error.setErrorCode(HttpStatus.PRECONDITION_FAILED.value());
			error.setMessage(ex.getMessage());
			return new ResponseEntity<ErrorResponse>(error, HttpStatus.OK);
			}*/
}



//=======================================
// http://localhost:8080/7_spring_mvc_4_rest/service/greeting/Nibedita



//produces = MediaType.APPLICATION_JSON_VALUE is supported by Spring 4


//http://localhost:8080/7_spring_mvc_4_rest/user/nibu
//http://localhost:8080/7_spring_mvc_4_rest/user/card/nibu