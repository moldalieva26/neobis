package com.furnitureshop.app.v1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.furnitureshop.app.v1.entity.Category;
import com.furnitureshop.app.v1.entity.ProductCategory;
import com.furnitureshop.app.v1.repository.CategoryRepository;
// dopisat'
@Service
public class CategoryService {
	@Autowired 
	public CategoryRepository categoryRepository;

	public List<Category> getAllCategories() {
		return categoryRepository.findAll();
	}

	public Category getCategoryById(Long id) {
		return categoryRepository.findById(id).get();
	}

	public Category createCategory(Category category) {
		return categoryRepository.save(category); // did not work, returnd null values
	}

	public void deleteCategory(Long id) {
		categoryRepository.deleteById(id);
	}

	public Category updateCategory(Long id, Category newCategory) {
		if(categoryRepository.findById(id).isPresent()) {
			Category category = categoryRepository.findById(id).get();
			category.setCategoryName(newCategory.getCategoryName());
			category.setSubCategoryName(newCategory.getSubCategoryName());
			return category;
			
		}
		return null;
		
	}

}
