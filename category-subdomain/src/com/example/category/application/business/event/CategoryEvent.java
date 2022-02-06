package com.example.category.application.business.event;

import java.util.UUID;

public class CategoryEvent {
	
    private final String eventId;

    public CategoryEvent(String eventId) {
        this.eventId = eventId;
    }
    public CategoryEvent(){
        this.eventId= UUID.randomUUID().toString();
    }
    public String getEventId() {
        return eventId;
    }

}
