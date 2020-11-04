package com.furniture.shop.webappv1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tag")
public class Tag {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String tag_name;
	
	
	public Tag() {
		
	}
	


}
