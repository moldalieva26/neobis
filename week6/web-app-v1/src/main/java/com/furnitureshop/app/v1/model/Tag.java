package com.furnitureshop.app.v1.model;

	
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	//Map relationship

	@Entity
	@Table(name="tag")
	public class Tag {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Long id;
		
		@Column(name="tag_name")
		private String tagName;
	
}
