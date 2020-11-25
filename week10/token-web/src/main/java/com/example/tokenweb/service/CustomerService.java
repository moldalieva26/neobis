package com.example.tokenweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tokenweb.entity.CustomerEntity;
import com.example.tokenweb.repository.CustomerRepository;




@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;
	
	public CustomerEntity getCustomer(Long id) {
		return customerRepository.findById(id).get(); // Optional<Customer> needed if not to use get()
	}

	public List<CustomerEntity> getAllCustomers() {
		return customerRepository.findAll();
	}

	public CustomerEntity createUser(CustomerEntity customer) {
		return customerRepository.save(customer);
		
	}

}
