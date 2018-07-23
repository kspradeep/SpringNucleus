package com.thbs.mis.exception;

/**
 * Title : ErrorResponse
 * 
 * @author Nibedita Panda
 * @date 17-June-2016
 * Description : This class is used as a model to send the error response,
 * when there is any exception caught in the application
 *  
 * */
public class ErrorResponse {
	private int errorCode;
	private String message;
	
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}