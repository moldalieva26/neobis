package com.furnitureshop.app.v1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.furnitureshop.app.v1.model.Customer;
import com.furnitureshop.app.v1.model.CustomerDto;
import com.furnitureshop.app.v1.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;
	
	public Customer getCustomer(Long id) {
		return customerRepository.findById(id).get(); // Optional<Customer> needed if not to use get()
	}

	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	public Customer createUser(Customer customer) {
		return customerRepository.save(customer);
		
	}

	public Customer findCustomerByEmail(String email) {
		return customerRepository.findByEmail(email);
		
	}

	public Customer updateCustomer(Long id, CustomerDto customerDto) {
		if( customerRepository.findById(id).isPresent()) {
			System.out.println("Customer found");
		Customer customer = customerRepository.findById(id).get();
  		customer.setFirstName(customerDto.getFirstName());
		customer.setLastName(customerDto.getLastName());
		customer.setPhoneNumber(customerDto.getPhoneNumber()); // add more fields
		
		Customer updatedCustomer = customerRepository.save(customer);
		return updatedCustomer;
			
		} else {
			return null;

		}
		
	}

	public void deleteCustomer(Long id) {
		customerRepository.deleteById(id);
		
	}
	

}
