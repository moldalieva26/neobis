package com.furniture.shop.webappv1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.furniture.shop.webappv1.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{
	

}
