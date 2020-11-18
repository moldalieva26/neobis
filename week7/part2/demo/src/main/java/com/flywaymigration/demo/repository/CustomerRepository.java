package com.flywaymigration.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flywaymigration.demo.entity.CustomerEntity;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {

}
