package com.example.category.application.business;

import com.example.category.application.CategoryApplication;
import com.example.category.domain.Category;
import com.example.category.infra.EventPublisher;
import com.example.category.repository.CategoryRepository;

public class StandartCategoryApplication implements CategoryApplication {

	private CategoryRepository categoryRepository;
    private EventPublisher eventPublisher;

    public StandartCategoryApplication(CategoryRepository categoryRepository, EventPublisher eventPublisher) {
        this.categoryRepository = categoryRepository;
        this.eventPublisher = eventPublisher;
    }

    @Override
    public Category getCategory(Category categoryID) {
        return categoryRepository.getCategory(categoryID);
    }
}
