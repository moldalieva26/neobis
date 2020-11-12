package com.furnitureshop.app.v1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.furnitureshop.app.v1.model.Tag;

public interface TagRepository extends JpaRepository<Tag, Long> {

}
