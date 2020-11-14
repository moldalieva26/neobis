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

import com.furnitureshop.app.v1.model.ProductTag;
import com.furnitureshop.app.v1.service.ProductTagService;

// Rename vars in model class
@RestController
@RequestMapping("/tags")
public class ProductTagController {
	@Autowired
	public ProductTagService productTagService;
	
	@GetMapping
	public List<ProductTag> getTags() {
		return productTagService.getAllTags(); 
		
	}
	
	@GetMapping("/{id}")
	public ProductTag getTag(@PathVariable Long id) { 
		return productTagService.getTagById(id);
	}
	
	@PutMapping("/{id}")
	public ProductTag updateTag(@PathVariable Long id, ProductTag newTag) { // working incorrectly ???
		return productTagService.updateTag(id, newTag);
	}
	
	@PostMapping
	public ProductTag createTag(@RequestBody ProductTag tag) {
		return productTagService.createTag(tag);
		
	}
	
	@DeleteMapping("/{id}")
	public void deleteTag(@PathVariable Long id) {
		productTagService.deleteTag(id);
	}
	

}
