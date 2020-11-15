package com.furnitureshop.app.v1.entity;

import javax.persistence.CascadeType;
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
@Table(name="cart")
public class Cart {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@OneToOne()
	@JoinColumn(name="customer_id") //??
	private Customer customerId;

	
	
	public Cart() {

	}



	public Cart(Long id, Customer customerId) {
		super();
		this.id = id;
		this.customerId = customerId;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Customer getCustomerId() {
		return customerId;
	}



	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}
	
	
	

	

}
