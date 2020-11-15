package com.furnitureshop.app.v1.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
// incorect mapping with Category entity - product_category
@Entity
@Table(name="product_category")
public class ProductCategory {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id; 

	@ManyToOne
	@JoinColumn(name="category_id")
	private ProductCategory categoryId;
	
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product productId;
	
	public ProductCategory() {
		
	}

	public ProductCategory(Long id, ProductCategory categoryId, Product productId) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.productId = productId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ProductCategory getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(ProductCategory categoryId) {
		this.categoryId = categoryId;
	}

	public Product getProductId() {
		return productId;
	}

	public void setProductId(Product productId) {
		this.productId = productId;
	}
	
	



	


}
