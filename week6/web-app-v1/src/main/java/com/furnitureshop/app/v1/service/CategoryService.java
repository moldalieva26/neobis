package com.furnitureshop.app.v1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.furnitureshop.app.v1.entity.CategoryEntity;
import com.furnitureshop.app.v1.entity.ProductCategoryEntity;
import com.furnitureshop.app.v1.repository.CategoryRepository;
// dopisat'
@Service
public class CategoryService {
	@Autowired 
	public CategoryRepository categoryRepository;

	public List<CategoryEntity> getAllCategories() {
		return categoryRepository.findAll();
	}

	public CategoryEntity getCategoryById(Long id) {
		return categoryRepository.findById(id).get();
	}

	public CategoryEntity createCategory(CategoryEntity category) {
		return categoryRepository.save(category); // did not work, returnd null values
	}

	public void deleteCategory(Long id) {
		categoryRepository.deleteById(id);
	}

	public CategoryEntity updateCategory(Long id, CategoryEntity newCategory) { // does not work
		if(categoryRepository.findById(id).isPresent()) {
			CategoryEntity category = categoryRepository.findById(id).get();
			category.setCategoryName(newCategory.getCategoryName());
			category.setSubCategoryName(newCategory.getSubCategoryName());
			return category;
			
		}
		return null;
		
	}

}
