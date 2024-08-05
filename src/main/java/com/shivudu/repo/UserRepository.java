package com.shivudu.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivudu.entity.User;

public interface UserRepository extends JpaRepository<User, Serializable> {
	User findByUsername(String username);
}
