package com.furnitureshop.app.v1.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="product_category")
public class ProductCategory {
	
	@Id
	private Long id; // do i need it
	
	@ManyToOne
	@JoinColumn(name="category_id")
	private Category categoryId;
	
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product productId;
	
	public ProductCategory() {
		
	}
	

	
	

}
