package com.example.category.repository;

import com.example.category.domain.Category;

public interface CategoryRepository {
    Category getCategory(Category id);
}
