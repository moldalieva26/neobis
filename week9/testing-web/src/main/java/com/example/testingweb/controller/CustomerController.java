package com.example.testingweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.testingweb.entity.CustomerEntity;
import com.example.testingweb.service.CustomerService;


@RestController
@RequestMapping("/customers")
public class CustomerController {
	

		
		@Autowired
		private  CustomerService customerService; //?'
		//Consider defining a bean of type 'com.furniture.shop.webappv1.service.CustomerService' in your configuration.

		
		@GetMapping(path="/{id}") // works
		public CustomerEntity getCustomer(@PathVariable Long id) {
			return customerService.getCustomer(id); 
		}
		

		@GetMapping("/all") //works
		public List<CustomerEntity> getCutomers(){
			return customerService.getAllCustomers();
		}
		
		@PostMapping(consumes=MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE) //works
		public CustomerEntity createCustomer(@RequestBody CustomerEntity customer) {
			return customerService.createUser(customer);
		}
		
		// @Put
		// @Delete

}

