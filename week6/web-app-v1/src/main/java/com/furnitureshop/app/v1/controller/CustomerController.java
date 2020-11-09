package com.furniture.shop.webappv1.controller;

//import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.furniture.shop.webappv1.model.Customer;
//import com.furniture.shop.webappv1.service.CustomerService;

@RestController
//@RequestMapping("/customers")
public class CustomerController {
	
	//@Autowired
	//private  CustomerService customerService; //?'
	//Consider defining a bean of type 'com.furniture.shop.webappv1.service.CustomerService' in your configuration.

	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello Get Mapping";
	}
/*	
	@GetMapping(value="/customers")
	public List<Customer> getCutomers(){
		
		return customerService.getAllCustomers();
		
	}

*/	 
	
	
	
	

}
