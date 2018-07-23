package com.thbs.mis.exception;

/**
 * Title : UserNotFoundException
 * 
 * @author Nibedita Panda
 * @date 17-June-2016
 * Description : This class is the custom defined exception for user not found.
 *  
 * */

public class UserNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;
	private String errorMessage;

	public String getErrorMessage() {
		return errorMessage;
	}
	public UserNotFoundException(String errorMessage) {
		super(errorMessage);
		this.errorMessage = errorMessage;
	}
	public UserNotFoundException() {
		super();
	}
}