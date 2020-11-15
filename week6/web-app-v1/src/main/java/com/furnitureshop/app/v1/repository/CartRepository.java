package com.furnitureshop.app.v1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.furnitureshop.app.v1.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {

}
