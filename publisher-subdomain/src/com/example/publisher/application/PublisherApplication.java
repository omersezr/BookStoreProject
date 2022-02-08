package com.example.publisher.application;

import java.util.Optional;

import com.example.publisher.domain.Publisher;
import com.example.publisher.domain.PublisherId;

public interface PublisherApplication {

	Optional<Publisher> findByPublisherId(PublisherId publisherId);
	Publisher savePublisher (Publisher publisher);

}
