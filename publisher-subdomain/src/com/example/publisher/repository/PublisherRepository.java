package com.example.publisher.repository;

import java.util.Optional;

import com.example.publisher.domain.Publisher;
import com.example.publisher.domain.PublisherId;

public interface PublisherRepository {
	boolean PublisherId(PublisherId publisherId);
	Publisher save(Publisher publisher);
	Optional<Publisher> findOneByPublisherId(PublisherId publisherId);
	

}
