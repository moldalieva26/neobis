package com.furnitureshop.app.v1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.furnitureshop.app.v1.entity.ProductCategory;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> { //??? long

}
