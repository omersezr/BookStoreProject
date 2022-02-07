package com.example.stock.infra;

import com.example.stock.application.business.event.StockEvent;

public interface EventPublisher<Event> {
	
	void publishEvent(StockEvent businessEvent);	
	
}
