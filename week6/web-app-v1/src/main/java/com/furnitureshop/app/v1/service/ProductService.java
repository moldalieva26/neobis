package com.furnitureshop.app.v1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.furnitureshop.app.v1.entity.Customer;
import com.furnitureshop.app.v1.entity.Product;
import com.furnitureshop.app.v1.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;

	public Product getProduct(Long id) {
		return productRepository.findById(id).get(); //if not, throw exceptiond
	}

	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}
/*
	public Product getProductByName(String productName) {
		return productRepository.findByProductName(productName);
	}
*/
	public List<Product> getProductsByName(String productName) {
		return productRepository.findByProductName(productName);

	}

	public List<Product> getProductsByCategory(Long categoryId) {
		// TODO Auto-generated method stub
		return productRepository.findByCategoryId(categoryId);
	}

	public Product createProduct(Product product) {
		return productRepository.save(product);
	}

	public Product updateProduct(Long id, Product newProduct) { //updated later 
		if(productRepository.findById(id).isPresent()) {
			Product existingProduct = productRepository.findById(id).get();
			existingProduct.setProductName(newProduct.getProductName());
			existingProduct.setPrice(newProduct.getPrice());
			existingProduct.setCategoryId(newProduct.getCategoryId());
			return  productRepository.save(existingProduct); //?

		} else {
			return null;
		}
		
	}

	public void deleteProduct(Long id) {
		 productRepository.deleteById(id);
	}


}
