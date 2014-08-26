package org.plivo.ee.helper.exception;

public class PlivoException extends Exception {
	private static final long serialVersionUID = 1L;
	private String message;

	public PlivoException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}