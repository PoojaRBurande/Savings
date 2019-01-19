package com.savings.controllers;

public class ApplicationException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String exception;
	public ApplicationException(String exception){
		this.exception = exception;
	}
	public String getException() {
		return exception;
	}
	public void setException(String exception) {
		this.exception = exception;
	}
}
