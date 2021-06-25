package com.springdatajpa.boot.exception;

//Custom Exception that going to be thrown in case file for uploading cannot be found
public class StorageFileNotFoundException extends StorageException {

	public StorageFileNotFoundException(String message) {
		super(message);
	}

	public StorageFileNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
}