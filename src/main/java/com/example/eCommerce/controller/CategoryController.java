package com.example.eCommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.eCommerce.entity.Category;
import com.example.eCommerce.service.CategoryService;

@RequestMapping("category")
@RestController 
public class CategoryController {
	
	@Autowired
	public CategoryService categoryService;
	
	@GetMapping("/saveCategory")
	public ResponseEntity<Category> createCategory(@RequestBody Category category){
		Category newCategory = categoryService.createCategory(category);
		return new ResponseEntity<>(newCategory,HttpStatus.OK);
	}
	
	@GetMapping("/getAllCategory")
	public ResponseEntity<List<Category>> getAllCategory(){
		List<Category> allCategory = categoryService.getAllCategory();
		return new ResponseEntity<>(allCategory,HttpStatus.OK);
	}
	
	@PostMapping("/updateCategory/{categoryId}")
	public ResponseEntity<Category> updateCategory(@PathVariable int categoryId, @RequestBody Category category){
		Category updatedCategory = categoryService.updateCategory(categoryId,category);
		return new ResponseEntity<>(updatedCategory,HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteCaregory/{categoryId}")
	public ResponseEntity<String> deleteCategoryById(@PathVariable int categoryId){
		categoryService.deleteCategoryById(categoryId);
		return ResponseEntity.ok("Category Delete successfully");
	}

}
