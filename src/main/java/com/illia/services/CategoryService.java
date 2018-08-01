package com.illia.services;

import com.illia.model.Category;

import java.util.List;

public interface CategoryService {

    List<Category> findAll();
    Category findById(Long id);
}
