package com.furnitureshop.app.v1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.furnitureshop.app.v1.entity.ProductCategory;
import com.furnitureshop.app.v1.service.ProductCategoryService;

@RestController
@RequestMapping("productcategory")
public class ProductCategoryController {
	@Autowired ProductCategoryService productCategoryService;

	@GetMapping
	public List<ProductCategory> getAllProductCategories() {
		return productCategoryService.getAllProductCategories();
	}
	
	@GetMapping("/{id}")
	public ProductCategory getProductCategory(@PathVariable Long id) {
		return productCategoryService.getProductCategory(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteProductCategory(@PathVariable Long id) {
		productCategoryService.deleteProductCategory(id);
	}
	
	@PostMapping()
	public ProductCategory createProductCategory(@RequestBody ProductCategory productCategory) {
			return productCategoryService.createProductCategory(productCategory);
		}
	
	@PutMapping("/{id}")
	public ProductCategory updateProductCategory(@RequestBody ProductCategory newProductCategory, Long id) {
		return null; // finish!
		
	}
	
	
	
}
