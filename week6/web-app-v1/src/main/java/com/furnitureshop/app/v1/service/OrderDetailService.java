package com.furnitureshop.app.v1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.furnitureshop.app.v1.entity.OrderDetail;
import com.furnitureshop.app.v1.repository.OrderDetailRepository;

@Service
public class OrderDetailService {

	@Autowired OrderDetailRepository orderDetailRepository;

	public List<OrderDetail> getAllOrderDetails() {
		return orderDetailRepository.findAll();
	}


	public OrderDetail getOrderDetailById(Long id) {
		return orderDetailRepository.findById(id).get();
	}


	public OrderDetail createOrderDetail(OrderDetail orderDetail) {
		return orderDetailRepository.save(orderDetail);
	}


	public void deleteOrderDetail(Long id) {
		orderDetailRepository.deleteById(id);
		
	}


	public OrderDetail updateOrderDetail(Long id, OrderDetail newOrderDetail) {
		if(orderDetailRepository.findById(id).isPresent()) {
			OrderDetail orderDetail = orderDetailRepository.findById(id).get();
			orderDetail.setOrderId(newOrderDetail.getOrderId());
			orderDetail.setProductId(newOrderDetail.getProductId());
			orderDetail.setQuantity(newOrderDetail.getQuantity());
			orderDetail.setSubtotal(newOrderDetail.getSubtotal());
			orderDetail.setTax(newOrderDetail.getTax());
			orderDetail.setTotal(newOrderDetail.getTotal());
			return orderDetail;
			
			
		}
		
		return null;
	}
}
