package com.furnitureshop.app.v1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.furnitureshop.app.v1.model.ProductTag;
import com.furnitureshop.app.v1.repository.TagRepository;

// To Do: 
//add else, if, try catch for exceptions
@Service
public class ProductTagService {
	
	@Autowired TagRepository tagRepository;
	
	public List<ProductTag> getAllTags() {
		return tagRepository.findAll();
	}

	public ProductTag getTagById(Long id) {
		return tagRepository.findById(id).get();
	}

	public ProductTag updateTag(Long id, ProductTag newTag) {
		if(tagRepository.findById(id).isPresent()) {
			ProductTag tag = tagRepository.findById(id).get();
		
			return  tagRepository.save(tag); // returns null after updating???
			
			
		}
		return null;
	}

	public ProductTag createTag(ProductTag tag) {
		return tagRepository.save(tag);
	}

	public void deleteTag(Long id) {
		tagRepository.deleteById(id);
		
	}

}
