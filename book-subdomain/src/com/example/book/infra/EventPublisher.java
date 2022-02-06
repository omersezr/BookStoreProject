package com.example.book.infra;

import com.example.book.application.business.event.BookEvent;

public interface EventPublisher {

	public void publishEvent(BookEvent businessEvent);

}
