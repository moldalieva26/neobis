package com.example.testingweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.testingweb.entity.CustomerEntity;


public interface CustomerRepository extends JpaRepository<CustomerEntity, Long>{

}
