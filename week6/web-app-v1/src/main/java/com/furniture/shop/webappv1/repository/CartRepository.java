package com.furniture.shop.webappv1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.furniture.shop.webappv1.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {

}
