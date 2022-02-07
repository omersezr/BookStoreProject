package com.example.order.application.business.event;

import com.example.order.domain.Order;

public class OrderFiredEvent extends OrderEvent {
	
	private final Order orderId;

	public OrderFiredEvent(Order orderId) {
		this.orderId = orderId;
	}

	public Order getOrder() {
		return orderId;
	}

}
