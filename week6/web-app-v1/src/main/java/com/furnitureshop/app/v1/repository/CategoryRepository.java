package com.furnitureshop.app.v1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.furnitureshop.app.v1.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}