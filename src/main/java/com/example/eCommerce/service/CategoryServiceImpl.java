package com.example.eCommerce.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.eCommerce.entity.Category;
import com.example.eCommerce.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	public CategoryRepository categoryRepository;
	
	@Override
	public Category createCategory(Category category) {
		return categoryRepository.save(category);
		
	}

	@Override
	public List<Category> getAllCategory() {
		
		return categoryRepository.findAll();
	}

	@Override
	public void deleteCategoryById(int categoryId) {
		categoryRepository.deleteById(categoryId);
		
	}

	@Override
	public Category updateCategory(int categoryId , Category category) {
		 Category categoryDb = categoryRepository.findById(categoryId).get();
		 
			if(Objects.nonNull(category.getCategoryname())&&
					!"".equalsIgnoreCase(category.getCategoryname())) {
				categoryDb.setCategoryname(category.getCategoryname());
			}

			
			return categoryDb;
	
}
}
