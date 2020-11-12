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

import com.furnitureshop.app.v1.model.Tag;
import com.furnitureshop.app.v1.service.TagService;

// Rename vars in model class
@RestController
@RequestMapping("/tags")
public class TagController {
	@Autowired
	public TagService tagService;
	
	@GetMapping
	public List<Tag> getTags() {
		return tagService.getAllTags(); 
		
	}
	
	@GetMapping("/{id}")
	public Tag getTag(@PathVariable Long id) { 
		return tagService.getTagById(id);
	}
	
	@PutMapping("/{id}")
	public Tag updateTag(@PathVariable Long id, Tag newTag) { // working incorrectly ???
		return tagService.updateTag(id, newTag);
	}
	
	@PostMapping
	public Tag createTag(@RequestBody Tag tag) {
		return tagService.createTag(tag);
		
	}
	
	@DeleteMapping("/{id}")
	public void deleteTag(@PathVariable Long id) {
		tagService.deleteTag(id);
	}
	

}
