package com.example.order.application.business.exception;

@SuppressWarnings("serial")
public class OrderNotFoundException extends RuntimeException {
	
	private final String orderId;
	
    public OrderNotFoundException(String message, String orderId) {
        super(message);
        this.orderId = orderId;
    }

    public String getorderId() {
        return orderId;
    }

}
