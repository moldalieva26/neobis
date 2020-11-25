package com.example.tokenweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tokenweb.entity.CustomerEntity;



public interface CustomerRepository extends JpaRepository<CustomerEntity, Long>{

}
