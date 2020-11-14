package com.furnitureshop.app.v1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.furnitureshop.app.v1.model.ProductTag;

public interface TagRepository extends JpaRepository<ProductTag, Long> {

}
