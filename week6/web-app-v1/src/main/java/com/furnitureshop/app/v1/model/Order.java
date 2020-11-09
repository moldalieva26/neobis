package com.furnitureshop.app.v1.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name="customer_order") // renamed since order is reserved word in SQL
//
public class Order { 
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false) // ?
	@JoinColumn(name="customer_id")
	@OnDelete(action = OnDeleteAction.CASCADE)// deletes all child elements (orders) when parent (customer) is deleted
	private Customer customer;
	
	@Column(name="order_date")
	private String orderDate; 
	
	@Column(name="status")
	private Short status;

	public Order() {
		
	}

	
	
	
	

	

	
}
