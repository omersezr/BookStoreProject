package com.example.sale.infra;

import com.example.sale.application.business.event.SaleEvent;

public interface EventPublisher<Event> {
	void publishEvent(SaleEvent businessevent);	
}
