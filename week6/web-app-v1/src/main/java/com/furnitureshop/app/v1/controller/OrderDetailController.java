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

import com.furnitureshop.app.v1.entity.OrderDetail;
import com.furnitureshop.app.v1.service.OrderDetailService;

@RestController
@RequestMapping("/orderdetails")
public class OrderDetailController {
	@Autowired
	public OrderDetailService orderDetailService;
	
	@GetMapping
	public List<OrderDetail> getAllOrderDetails(){
		return orderDetailService.getAllOrderDetails();
	}
	
	
	@GetMapping("/{id}")
	public OrderDetail getOrderDetailById(@PathVariable Long id) {
		return orderDetailService.getOrderDetailById(id);
	}
	
	@PostMapping
	public OrderDetail createOrderDetail(OrderDetail orderDetail) { // returns nulls
		return orderDetailService.createOrderDetail(orderDetail);
	}
	
	@DeleteMapping("/{id}")
	public void deleteOrderDetail(@PathVariable Long id) {
		orderDetailService.deleteOrderDetail(id);
	}
	
	@PutMapping("/{id}")
	public OrderDetail updateOrderDetail(@PathVariable Long id, OrderDetail newOrderDetail) {
		return orderDetailService.updateOrderDetail(id, newOrderDetail);
	}
	

}
