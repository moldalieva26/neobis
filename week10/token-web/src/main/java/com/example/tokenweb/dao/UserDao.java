package com.example.tokenweb.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.tokenweb.entity.DAOUser;

@Repository
public interface UserDao extends CrudRepository<DAOUser, Integer> {

}
