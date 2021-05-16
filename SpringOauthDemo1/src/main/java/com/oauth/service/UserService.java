package com.oauth.service;

import java.util.List;

import com.oauth.model.User;

public interface UserService {

	List findAll();

	User save(User user);

	void delete(Long id);

}
