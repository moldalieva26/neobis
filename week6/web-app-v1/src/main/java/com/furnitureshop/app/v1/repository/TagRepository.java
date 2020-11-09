package com.furniture.shop.webappv1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.furniture.shop.webappv1.model.Tag;

public interface TagRepository extends JpaRepository<Tag, Long> {
}
