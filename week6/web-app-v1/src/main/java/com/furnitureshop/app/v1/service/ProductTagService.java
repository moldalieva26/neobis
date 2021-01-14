package com.furnitureshop.app.v1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.furnitureshop.app.v1.entity.ProductTagEntity;
import com.furnitureshop.app.v1.repository.ProductTagRepository;
import com.furnitureshop.app.v1.repository.TagRepository;

// To Do: 
//add else, if, try catch for exceptions
@Service
public class ProductTagService {
	
	@Autowired ProductTagRepository productTagRepository;
	
	public List<ProductTagEntity> getAllTags() {
		return productTagRepository.findAll();
	}

	public ProductTagEntity getTagById(Long id) {
		return productTagRepository.findById(id).get();
	}

	public ProductTagEntity updateTag(Long id, ProductTagEntity newProductTag) {
		if(productTagRepository.findById(id).isPresent()) {
			ProductTagEntity tag = productTagRepository.findById(id).get();
		// dopisat'
			return  productTagRepository.save(tag); // returns null after updating???
			
			
		}
		return null;
	}

	public ProductTagEntity createTag(ProductTagEntity tag) {
		return productTagRepository.save(tag);
	}

	public void deleteTag(Long id) {
		productTagRepository.deleteById(id);
		
	}

}
