package com.example.publisher.application.business.event;

import com.example.publisher.domain.Publisher;

public class PublisherSavedEvent extends PublisherEvent {
	private final Publisher publisher;

	public PublisherSavedEvent(Publisher publisher) {
		this.publisher = publisher;
	}

	public Publisher getPublisher() {
		return publisher;
	}
	

}

