package com.example.order.application.business.event;

import com.example.order.domain.Order;

public class OrderHiredEvent extends OrderEvent {
	
	private final Order orderId;

	public OrderHiredEvent(Order orderId) {
		this.orderId = orderId;
	}

	public Order getOrder() {
		return orderId;
	}

}
