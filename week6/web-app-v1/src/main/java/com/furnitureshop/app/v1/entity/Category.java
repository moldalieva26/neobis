package com.furnitureshop.app.v1.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="category")
public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id; 
	
	@Column(name="category_name")
	private String categoryName;
	
	@Column(name="sub_category_name")
	private String subCategoryName;
	
	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="product_category_id")
	//@OnDelete(action=OnDeleteAction.CASCADE)
	private List<ProductCategory> productCategoryId;
	
	public Category() {
		
	}
	
	

	public Category(Long id, String categoryName, String subCategoryName, List<ProductCategory> productCategoryId) {
		super();
		this.id = id;
		this.categoryName = categoryName;
		this.subCategoryName = subCategoryName;
		this.productCategoryId = productCategoryId;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getSubCategoryName() {
		return subCategoryName;
	}

	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}

	public List<ProductCategory> getProductCategoryId() {
		return productCategoryId;
	}

	public void setProductCategoryId(List<ProductCategory> productCategoryId) {
		this.productCategoryId = productCategoryId;
	}
	
	
}
