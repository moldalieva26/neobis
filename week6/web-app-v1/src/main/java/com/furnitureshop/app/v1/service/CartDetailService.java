package com.furnitureshop.app.v1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.furnitureshop.app.v1.entity.Cart;
import com.furnitureshop.app.v1.entity.CartDetail;
import com.furnitureshop.app.v1.repository.CartDetailRepository;

@Service
public class CartDetailService {
	@Autowired CartDetailRepository cartDetailRepository;

	public CartDetail getCartById(Long id) {
		return cartDetailRepository.findById(id).get();
	}

	public List<CartDetail> getAllCartDetails() {
		return cartDetailRepository.findAll();
	}

	public CartDetail createCartDetail(CartDetail cartDetail) {
		return cartDetailRepository.save(cartDetail);
	}

	public void deleteCartDetail(Long id) {
		cartDetailRepository.deleteById(id);		
	}

	public void updateCartDetail(Long id, CartDetail newCartDetail) {
		if(cartDetailRepository.findById(id).isPresent()) {
			CartDetail cartDetail = cartDetailRepository.findById(id).get();
			cartDetail.setQuantity(newCartDetail.getQuantity());
			cartDetail.setProductId(newCartDetail.getProductId());
		//	cartDetail.setCartId(newCartDetail.getCartId());

		}
		
	}

}
