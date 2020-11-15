package com.furnitureshop.app.v1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.furnitureshop.app.v1.entity.Favorite;
import com.furnitureshop.app.v1.repository.FavoriteRepository;

@Service
public class FavoriteService {
	@Autowired 
	public FavoriteRepository favoriteRepository;

	public List<Favorite> getAllFavorites() {
		return favoriteRepository.findAll();
	}

	public Favorite getFavoriteById(Long id) {
		return favoriteRepository.findById(id).get();
	}

	public Favorite createFavorite(Favorite favorite) {
		return favoriteRepository.save(favorite);
	}

	public void deleteFavorite(Long id) {
		favoriteRepository.deleteById(id);
		
	}

	public void updateFavorite(Long id, Favorite newFavorite) {
		if(favoriteRepository.findById(id).isPresent()){
			Favorite favorite = favoriteRepository.findById(id).get();
			favorite.setCustomerId(newFavorite.getCustomerId()); //?
			favorite.setProductId(newFavorite.getProductId());
			
		}
	} 
	
	

}
