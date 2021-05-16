package com.oauth.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oauth.model.User;

@Repository
public interface UserDao extends  JpaRepository<User, Long>{

	User findByUsername(String userId);
	}
