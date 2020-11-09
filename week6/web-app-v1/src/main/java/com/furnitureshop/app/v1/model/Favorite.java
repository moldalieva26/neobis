package com.furniture.shop.webappv1.model;

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
@Table(name="favorite")

public class Favorite {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id; //?
	
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn(name="product_id")
	private Product product;
	
	
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn(name="customer_id")
	@OnDelete(action=OnDeleteAction.CASCADE)
	private Customer customer;
	
	
	
	

}
