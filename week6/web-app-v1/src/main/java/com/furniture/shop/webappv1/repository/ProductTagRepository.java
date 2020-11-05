package com.furniture.shop.webappv1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.furniture.shop.webappv1.model.ProductTag;

public interface ProductTagRepository extends JpaRepository<ProductTag, Long> { //? needed? i do not have PK in this table

}
