package com.example.requistion.application.business.event;

import java.util.UUID;

public class RequistionEvent {

	private final String eventId;

    public RequistionEvent() {
        this.eventId = UUID.randomUUID().toString();
    }

    public String getEventId() {
        return eventId;
    }


}
