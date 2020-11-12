package com.furnitureshop.app.v1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.furnitureshop.app.v1.model.Tag;
import com.furnitureshop.app.v1.repository.TagRepository;

// To Do: 
//add else, if, try catch for exceptions
@Service
public class TagService {
	
	@Autowired TagRepository tagRepository;
	
	public List<Tag> getAllTags() {
		return tagRepository.findAll();
	}

	public Tag getTagById(Long id) {
		return tagRepository.findById(id).get();
	}

	public Tag updateTag(Long id, Tag newTag) {
		// TODO Auto-generated method stub
		if(tagRepository.findById(id).isPresent()) {
			Tag tag = tagRepository.findById(id).get();
			tag.setTag_name(newTag.getTag_name());
		
			return  tagRepository.save(tag); // returns null after updating???
			
			
		}
		return null;
	}

	public Tag createTag(Tag tag) {
		return tagRepository.save(tag);
	}

	public void deleteTag(Long id) {
		tagRepository.deleteById(id);
		// TODO Auto-generated method stub
		
	}

}
