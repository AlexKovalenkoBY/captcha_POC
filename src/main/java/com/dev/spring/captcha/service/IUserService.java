package com.dev.spring.captcha.service;


import java.util.List;
import java.util.Optional;

import com.dev.spring.captcha.model.User;

public interface IUserService {

	void createUser(User user);
	List<User> getAllUsers();
	Optional<User> getOneUser(Long Id);
}