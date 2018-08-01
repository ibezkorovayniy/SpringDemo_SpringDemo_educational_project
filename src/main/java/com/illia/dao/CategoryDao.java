package com.illia.dao;

import com.illia.model.Category;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public interface CategoryDao {
    public List<Category> findAll();
    Category findById(Long cId);

}
