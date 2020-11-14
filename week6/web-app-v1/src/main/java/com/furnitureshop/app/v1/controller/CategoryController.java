package com.furnitureshop.app.v1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.furnitureshop.app.v1.model.ProductCategory;
import com.furnitureshop.app.v1.service.CategoryService;

@RestController
@RequestMapping("/categories")
public class CategoryController {
	/*
	@Autowired
	public CategoryService categoryService;
	
	@GetMapping
	public List<ProductCategory> getAllCategories(){
		return categoryService.getAllCategories();
	}
	
	@GetMapping("/{id}")
	public ProductCategory getCategoryById(@PathVariable Long id) {
		return categoryService.getCategoryById(id);
	}
	
	@PostMapping
	public ProductCategory createCategory(ProductCategory category) {
		return categoryService.createCategory(category);
	}
	
	@DeleteMapping("/{id}") 
	public void deleteCategory(@PathVariable Long id) {
		categoryService.deleteCategory(id);
		
	}
	*/

}
