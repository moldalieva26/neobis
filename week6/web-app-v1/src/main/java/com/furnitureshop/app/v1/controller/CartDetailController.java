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

import com.furnitureshop.app.v1.model.CartDetail;
import com.furnitureshop.app.v1.service.CartDetailService;

// how to test?
@RestController
@RequestMapping("/cartdetails")
public class CartDetailController {
	@Autowired CartDetailService cartDetailService;
	
	@GetMapping("/{id}")
	public CartDetail getCartById(@PathVariable Long id) {
		return cartDetailService.getCartById(id);
	}
	
	@GetMapping
	public List<CartDetail> getAllCartDetails(){
		return cartDetailService.getAllCartDetails();
	}
	
	@PostMapping 
	public CartDetail createCartDetail(CartDetail cartDetail) { // cannot add or update child row 
		return cartDetailService.createCartDetail(cartDetail);
		
	}
	
	@DeleteMapping("/{id}")
	public void deleteCartDetail(@PathVariable Long id) {
		cartDetailService.deleteCartDetail(id);
	}
	
	@PutMapping("/{id}")
	public void updateCartDetail(@PathVariable Long id, CartDetail newCartDetail) {
		cartDetailService.updateCartDetail(id, newCartDetail);
	}
	

}
