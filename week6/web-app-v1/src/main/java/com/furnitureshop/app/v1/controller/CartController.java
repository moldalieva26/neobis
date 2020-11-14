package com.furnitureshop.app.v1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.furnitureshop.app.v1.model.Cart;
import com.furnitureshop.app.v1.service.CartService;

@RestController
@RequestMapping("/carts")
public class CartController {
	
	@Autowired
	public CartService cartService;
	
	@GetMapping
	public List<Cart> getAllCarts() {
		return cartService.getAllCarts();
		
	}
	
	@GetMapping("/{id}")
	public Cart getCartById(@PathVariable Long id) {
		return cartService.getCartById(id);
		
	}
	
	//Do I need? @PostMapping, @DeleteMapping, @UpdateMapping must be done when customer registers and deleted only when customer's aaccount is deleted
	@PostMapping
	public Cart createCart(Cart cart) {
		return cartService.createCart(cart);
		
	}
	
	@DeleteMapping("/{id}")
	public void deleteCart(@PathVariable Long id) {
		cartService.deleteCart(id);
		
	}
	

}
