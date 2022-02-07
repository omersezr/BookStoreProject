package com.example.order.infra;

import com.example.order.application.business.event.OrderEvent;

public interface EventPublisher<Event> {
	
	void publishEvent(OrderEvent businessEvent);	
	
}
