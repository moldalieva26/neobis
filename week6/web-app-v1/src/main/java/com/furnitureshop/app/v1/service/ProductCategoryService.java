package com.furnitureshop.app.v1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.furnitureshop.app.v1.model.ProductCategory;
import com.furnitureshop.app.v1.repository.ProductCategoryRepository;

@Service
public class ProductCategoryService {

	@Autowired
	ProductCategoryRepository productCategoryRepository;
	
	public List<ProductCategory> getAllProductCategories() {
		return productCategoryRepository.findAll();
	}

	public ProductCategory getProductCategory(Long id) {
		return productCategoryRepository.findById(id).get();
	}

	public void deleteProductCategory(Long id) {
		// TODO Auto-generated method stub
		productCategoryRepository.deleteById(id);
		
	}

	public ProductCategory createProductCategory(ProductCategory productCategory) {
		// TODO Auto-generated method stub
		return productCategoryRepository.save(productCategory);
	}

}
