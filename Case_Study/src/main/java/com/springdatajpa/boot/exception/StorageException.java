package com.springdatajpa.boot.exception;

//Custom Exception,that going to be thrown in case if not enough storage on the source for file uploading
public class StorageException extends RuntimeException {

	public StorageException(String message) {
		super(message);
	}

	public StorageException(String message, Throwable cause) {
		super(message, cause);
	}
}