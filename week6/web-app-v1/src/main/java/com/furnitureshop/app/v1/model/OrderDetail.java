package com.furnitureshop.app.v1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="order_detail")
public class OrderDetail { //so one order has one or multiple items
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id; 
	
	@ManyToOne
	@JoinColumn(name="order_id")
	private Order orderId;
	
	
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product productId;
	
	
	private Long quantity;
	private Float subtotal;
	private Float tax;
	// discount
	private Float total;

	public OrderDetail() {
		
	}

	
	
	
}
