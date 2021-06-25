package com.springdatajpa.boot.exception;

public class IncorrectUsernamePasswordException extends Exception {
	//Class created for implementing Custom Exception,that will be thrown if UserName or Password is not in the DB
	public IncorrectUsernamePasswordException() {
		super();
	}

	public IncorrectUsernamePasswordException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public IncorrectUsernamePasswordException(String message, Throwable cause) {
		super(message, cause);
	}

	public IncorrectUsernamePasswordException(String message) {
		super(message);
	}

	public IncorrectUsernamePasswordException(Throwable cause) {
		super(cause);
	}

}
