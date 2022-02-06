package com.example.category.infra;

import com.example.category.application.business.event.CategoryEvent;

public interface EventPublisher {
    void publishEvent(CategoryEvent businessEvent);
}
