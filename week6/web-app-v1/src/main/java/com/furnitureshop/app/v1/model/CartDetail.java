package com.furniture.shop.webappv1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="cart_detail")  // cart items (one cart has 1 or many items)
public class CartDetail {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id; //???
	
	
	@ManyToOne(fetch=FetchType.LAZY, optional=false) 
	@JoinColumn(name="cart_id")
	private Cart cartId;
	
	
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product productId;
	
	@Column(name="quantity")
	private Long quantity;
	
	
	public CartDetail() {
		
	}
	
	
	
	
}
