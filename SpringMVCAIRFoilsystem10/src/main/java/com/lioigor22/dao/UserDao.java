package com.lioigor22.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lioigor22.objects.User;

public interface UserDao extends JpaRepository<User, Long> {

	User findByUsername(String username);
}
