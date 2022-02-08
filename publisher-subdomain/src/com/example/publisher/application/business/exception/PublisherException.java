package com.example.publisher.application.business.exception;

@SuppressWarnings("serial")
public class PublisherException  extends RuntimeException{
	private final String publisherId;

	public PublisherException(String publisherId) {
		this.publisherId = publisherId;
	}

	public String getPublisherId() {
		return publisherId;
	}




	

}
