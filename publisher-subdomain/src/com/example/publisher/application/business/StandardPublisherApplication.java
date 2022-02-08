package com.example.publisher.application.business;

import java.util.Optional;

import com.example.publisher.application.PublisherApplication;
import com.example.publisher.domain.Publisher;
import com.example.publisher.domain.PublisherId;
import com.example.publisher.infra.EventPublisher;
import com.example.publisher.repository.PublisherRepository;


public class StandardPublisherApplication implements PublisherApplication{
	private PublisherRepository publisherRepository;
	private EventPublisher eventPublisher;
	
	public StandardPublisherApplication(PublisherRepository publisherRepository, EventPublisher eventPublisher) {
		this.publisherRepository = publisherRepository;
		this.eventPublisher = eventPublisher;
	}

	
	@Override
	public Optional<Publisher> findByPublisherId(PublisherId publisherId) {
		
		return publisherRepository.findOneByPublisherId(publisherId);
	}

	@Override
	public Publisher savePublisher(Publisher publisher) {
	
		return savedPublisher;
	}

	

}
