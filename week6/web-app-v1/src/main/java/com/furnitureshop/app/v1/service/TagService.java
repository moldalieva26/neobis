package com.furnitureshop.app.v1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.furnitureshop.app.v1.entity.Tag;
import com.furnitureshop.app.v1.repository.TagRepository;

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
		if(tagRepository.findById(id).isPresent()) {
			Tag tag = tagRepository.findById(id).get();
		
			return  tagRepository.save(tag); // returns null after updating???
			
			
		}
		return null;
	}

	public Tag createTag(Tag tag) {
		return tagRepository.save(tag);
	}

	public void deleteTag(Long id) {
		tagRepository.deleteById(id);
		
	}

}
