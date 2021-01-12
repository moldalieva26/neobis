package com.furnitureshop.app.v1.entity;

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
	private CartEntity cartId;
	
	
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product productId;
	
	@Column(name="quantity")
	private Long quantity;
	
	
	public CartDetail() {
		
	}


	public CartDetail(Long id, CartEntity cartId, Product productId, Long quantity) {
		super();
		this.id = id;
		this.cartId = cartId;
		this.productId = productId;
		this.quantity = quantity;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public CartEntity getCartId() {
		return cartId;
	}


	public void setCartId(CartEntity cartId) {
		this.cartId = cartId;
	}


	public Product getProductId() {
		return productId;
	}


	public void setProductId(Product productId) {
		this.productId = productId;
	}


	public Long getQuantity() {
		return quantity;
	}


	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	
	
	
	
	
	
}
