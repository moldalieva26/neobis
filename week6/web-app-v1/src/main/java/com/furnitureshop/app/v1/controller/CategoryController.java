package com.furnitureshop.app.v1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.furnitureshop.app.v1.entity.CategoryEntity;
import com.furnitureshop.app.v1.entity.ProductCategoryEntity;
import com.furnitureshop.app.v1.service.CategoryService;
//nothing works!!!!

@RestController
@RequestMapping("/categories")
public class CategoryController {
	
	@Autowired
	public CategoryService categoryService;
	
	@GetMapping
	public List<CategoryEntity> getAllCategories(){
		return categoryService.getAllCategories();
	}
	
	@GetMapping("/{id}")
	public CategoryEntity getCategoryById(@PathVariable Long id) {
		return categoryService.getCategoryById(id);
	}
	
	@PostMapping
	public CategoryEntity createCategory(CategoryEntity category) { // returned null 200 ok but DID NOT CREATE A CATEGORY
		return categoryService.createCategory(category);
	}
	
	@DeleteMapping("/{id}") 
	public void deleteCategory(@PathVariable Long id) {
		categoryService.deleteCategory(id);
		
	}
	
	@PutMapping("/{id}")
	public CategoryEntity updateCategory(@PathVariable Long id, CategoryEntity newCategory) { // returned null 200 ok
		return categoryService.updateCategory(id, newCategory);
	}
	

}
