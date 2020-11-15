package com.furnitureshop.app.v1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.furnitureshop.app.v1.entity.Favorite;
import com.furnitureshop.app.v1.service.FavoriteService;

@RestController
@RequestMapping("/favorites")
public class FavoriteController {
	@Autowired
	public FavoriteService favoriteService;
	
	
	@GetMapping
	public List<Favorite> getAllFavorites(){
		return favoriteService.getAllFavorites();
		
	}
	
	@GetMapping("/{id}")
	public Favorite getFavoriteById(@PathVariable Long id) {
		return favoriteService.getFavoriteById(id);
	}
	
	@PostMapping Favorite createFavorite(Favorite favorite) { // cannot add or create or update child row
		return favoriteService.createFavorite(favorite);
	}
	
	@DeleteMapping("/{id}")
	public void deleteFavorite(@PathVariable Long id) {
		favoriteService.deleteFavorite(id);
	}
	
	
	@PutMapping("/{id}")
	public void updateFavorite(@PathVariable Long id, Favorite newFavorite) {
		favoriteService.updateFavorite(id, newFavorite);
	}
	

}
