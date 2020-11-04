package com.furniture.shop.webappv1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.furniture.shop.webappv1.model.ProductCategory;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> { //??? long

}
