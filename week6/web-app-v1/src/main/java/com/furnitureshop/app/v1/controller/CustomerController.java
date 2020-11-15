package com.furnitureshop.app.v1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.furnitureshop.app.v1.entity.Customer;
import com.furnitureshop.app.v1.entity.CustomerDto;
import com.furnitureshop.app.v1.service.CustomerService;



@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	@Autowired
	private  CustomerService customerService; //?'
	//Consider defining a bean of type 'com.furniture.shop.webappv1.service.CustomerService' in your configuration.

	
	@GetMapping(path="/{id}") // works
	public Customer getCustomer(@PathVariable Long id) {
		return customerService.getCustomer(id); 
	}
	
	@GetMapping()  //works
	public Customer getCustomerByEmail(@RequestParam(value="email") String email) {
		return customerService.findCustomerByEmail(email);
	}

	@GetMapping("/all") //works
	public List<Customer> getCutomers(){
		return customerService.getAllCustomers();
	}
	
	@PostMapping(consumes=MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE) //works
	public Customer createCustomer(@RequestBody Customer customer) {
		return customerService.createUser(customer);
	}

	
	@PutMapping(path="/{id}", consumes=MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Customer updateCustomer(@RequestBody CustomerDto customerDto, @PathVariable Long id) {
		return customerService.updateCustomer(id, customerDto);	
	}

	@DeleteMapping(path="/{id}") 
	public @ResponseBody void deleteCustomer(@PathVariable Long id) {
		customerService.deleteCustomer(id);		
	}
	
	
	
	

}
