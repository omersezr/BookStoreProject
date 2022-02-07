package com.example.sale.application.business.exception;

@SuppressWarnings("serial")
public class ExistingSaleException extends RuntimeException {
	private final String identity;

	public ExistingSaleException(String message, String identity) {
		super(message);
		this.identity = identity;
	}

	public String getIdentity() {
		return identity;
	}
	

}
