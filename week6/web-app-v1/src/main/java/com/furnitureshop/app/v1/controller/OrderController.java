package com.furnitureshop.app.v1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.furnitureshop.app.v1.entity.CustomerEntity;
import com.furnitureshop.app.v1.entity.Order;
import com.furnitureshop.app.v1.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired
	public OrderService orderService;
	
	@GetMapping
	public List<Order> getAllOrders(){
		return orderService.getAllOrders();
	}
	
	@GetMapping("/{id}")
	public Order getOrderById(@PathVariable Long id) {
		return orderService.getOrderById(id);
	}
	
	//order.country // select orders where country == X from  join order and customer tables
		// "SELECT o.id, o.customer_id, c.country from  customer_order o INNER JOIN on o.customer_id = c.id customer c WHERE c.country=='USA'"
		
	@GetMapping(path="/{country}")
	public Order getOrderByCustomerCountry(@PathVariable String country) {
		return orderService.getOrderByCustomerCountry(country);
	}
	
	@PostMapping
	public Order createOrder(Order order) { // cannot create, customer_id cannot be put and does not have defaulte value
		return orderService.createOrder(order);
	}

	
	@PutMapping("/{id}")
	public Order updateOrder(@PathVariable Long id, Order newOrder) {
		return orderService.updateOrder(id, newOrder);
	}
	//delete?
	
}
