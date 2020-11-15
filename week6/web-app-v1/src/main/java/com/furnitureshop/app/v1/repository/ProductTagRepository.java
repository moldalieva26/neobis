package com.furnitureshop.app.v1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.furnitureshop.app.v1.entity.ProductTag;

public interface ProductTagRepository extends JpaRepository<ProductTag, Long> { //? needed? i do not have PK in this table

}
