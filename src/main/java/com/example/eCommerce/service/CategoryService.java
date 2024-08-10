package com.example.eCommerce.service;

import java.util.List;

import com.example.eCommerce.entity.Category;

public interface CategoryService {

public Category createCategory(Category category);

public List<Category> getAllCategory();

public void deleteCategoryById(int categoryId);

public Category updateCategory(int categoryId,Category category);

}
