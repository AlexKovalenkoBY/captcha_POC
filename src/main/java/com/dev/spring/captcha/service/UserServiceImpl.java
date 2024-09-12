package com.dev.spring.captcha.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.spring.captcha.model.User;
import com.dev.spring.captcha.repo.UserRepository;

@Service
public class UserServiceImpl implements IUserService {
   
    @Autowired
    private UserRepository repo;
    
    @Override
    public void createUser(User user) {
        repo.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return repo.findAll();
    }

    @Override
    public Optional<User> getOneUser(Long id) {
        return repo.findById(id);
    }

}