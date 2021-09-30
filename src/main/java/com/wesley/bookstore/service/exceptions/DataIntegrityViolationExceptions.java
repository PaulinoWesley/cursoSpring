package com.wesley.bookstore.service.exceptions;

public class DataIntegrityViolationExceptions extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DataIntegrityViolationExceptions(String message, Throwable cause) {
		super(message, cause);

	}

	public DataIntegrityViolationExceptions(String message) {
		super(message);

	}

}
