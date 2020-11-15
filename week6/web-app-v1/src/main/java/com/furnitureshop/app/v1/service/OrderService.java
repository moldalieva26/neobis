package com.furnitureshop.app.v1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.furnitureshop.app.v1.entity.Order;
import com.furnitureshop.app.v1.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	public OrderRepository orderRepository;

	public List<Order> getAllOrders() {
		return orderRepository.findAll();
	}

	public Order getOrderById(Long id) {
		return orderRepository.findById(id).get();
	}

	public Order createOrder(Order order) {
		return orderRepository.save(order);
	}

	public Order updateOrder(Long id, Order newOrder) {
		if(orderRepository.findById(id).isPresent()) {
			Order order = orderRepository.findById(id).get();
			order.setCustomer(newOrder.getCustomer());
			order.setOrderDate(newOrder.getOrderDate());
			order.setStatus(newOrder.getStatus());
			// how to save
			return order;
		}
		return null; // change
	}
	

}
