package com.furnitureshop.app.v1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Map relationship
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
	
	public Category() {
		
	}
}
