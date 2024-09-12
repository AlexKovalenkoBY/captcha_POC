package com.dev.spring.captcha.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.spring.captcha.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}