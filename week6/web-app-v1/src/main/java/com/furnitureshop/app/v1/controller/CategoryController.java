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

import com.furnitureshop.app.v1.entity.Category;
import com.furnitureshop.app.v1.entity.ProductCategory;
import com.furnitureshop.app.v1.service.CategoryService;

@RestController
@RequestMapping("/categories")
public class CategoryController {
	
	@Autowired
	public CategoryService categoryService;
	
	@GetMapping
	public List<Category> getAllCategories(){
		return categoryService.getAllCategories();
	}
	
	@GetMapping("/{id}")
	public Category getCategoryById(@PathVariable Long id) {
		return categoryService.getCategoryById(id);
	}
	
	@PostMapping
	public Category createCategory(Category category) { // returned null 200 ok
		return categoryService.createCategory(category);
	}
	
	@DeleteMapping("/{id}") 
	public void deleteCategory(@PathVariable Long id) {
		categoryService.deleteCategory(id);
		
	}
	
	@PutMapping("/{id}")
	public Category updateCategory(@PathVariable Long id, Category newCategory) { // returned null 200 ok
		return categoryService.updateCategory(id, newCategory);
	}
	

}
