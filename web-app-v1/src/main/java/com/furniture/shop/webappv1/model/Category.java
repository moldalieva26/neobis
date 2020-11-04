package com.furniture.shop.webappv1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="category")
public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id; 
	private String category_name;
	private String sub_category_name;
	
	public Category() {
		
	}


	


}
