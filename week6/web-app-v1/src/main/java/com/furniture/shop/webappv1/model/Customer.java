package com.furniture.shop.webappv1.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
// correct names of the properties
// connect to db and post something
// why tables were not created 
@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone_number")
	private String phoneNumber; 
	
	@Column(name="address_line1")
	private String addressLine1;
	
	@Column(name="address_line2")
	private String addressLine2;
	
	@Column(name="city")
	private String city;
	
	@Column(name="province")
	private String province;
	
	@Column(name="country")
	private String country;
	
	@Column(name="postal_code")
	private Integer postalCode; 
	
    @OneToOne (mappedBy="customerId") //non owning side // customerId from Cart.Class
    private Cart cart; // gives error, correct and uncomment
	 

	
	// if i use biderectorial mapping
	//@OneToMany(mappedBy = "customers", cascade = CascadeType.ALL, fetch=FetchType.LAZY)  // cascade = CascadeType.ALL, fetch=FetchType.LAZY ???
	//@JoinColumn(name="customer_id")
	//private Set<Order> orders; // Set? 
	

	
	public Customer() {
		
	}


	
/**

	public Set<Order> getOrders() {
		return orders;
	}


	public void setOrders(Set<Order> orders) {
		this.orders = orders;
		
		for(Order o: orders) {
			o.setCustomers(this);
		}
	}
*/


	
	
		

}
