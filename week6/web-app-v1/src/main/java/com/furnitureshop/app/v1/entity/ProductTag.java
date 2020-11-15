package com.furnitureshop.app.v1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
// change the var names

@Entity
@Table(name="product_tag")
public class ProductTag {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product productId;
	
	@ManyToOne
	@JoinColumn(name="tag_id")
	private ProductTag tagId;
	
	public ProductTag() {
		
	}

	public ProductTag(Long id, Product productId, ProductTag tagId) {
		super();
		this.id = id;
		this.productId = productId;
		this.tagId = tagId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Product getProductId() {
		return productId;
	}

	public void setProductId(Product productId) {
		this.productId = productId;
	}

	public ProductTag getTagId() {
		return tagId;
	}

	public void setTagId(ProductTag tagId) {
		this.tagId = tagId;
	}
	



}
