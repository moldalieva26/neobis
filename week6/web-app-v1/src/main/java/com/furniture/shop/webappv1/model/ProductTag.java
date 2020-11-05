package com.furniture.shop.webappv1.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="product_tag")
public class ProductTag { //details
	
	@Id
	private Long id; // do I need it
	
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product productId;
	
	@ManyToOne
	@JoinColumn(name="tag_id")
	private ProductTag tagId;
	
	public ProductTag() {
		
	}
	
	
	
}
