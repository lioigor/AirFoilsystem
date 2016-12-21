package com.lioigor22.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lioigor22.dao.UserDAO;
import com.lioigor22.objects.User;

@Service
public class UserServiceImpl implements UserService {

	private UserDAO UserDAO;

	public void setUserDAO(UserDAO UserDAO) {
		this.UserDAO = UserDAO;
	}

	@Override
	@Transactional
	public void addUser(User user) {
		this.UserDAO.addUser(user);
	}

	@Override
	@Transactional
	public void updateUser(User user) {
		this.UserDAO.updateUser(user);
	}

	@Override
	@Transactional
	public List<User> listUsers() {
		return this.UserDAO.listUsers();
	}

	@Override
	@Transactional
	public User getUserById(int id) {
		return this.UserDAO.getUserById(id);
	}

	@Override
	@Transactional
	public void removeUser(int id) {
		this.UserDAO.removeUser(id);
	}

	@Override
	@Transactional
	public boolean checkUser(User user) {

		return this.UserDAO.checkUser(user);

	}

	@Transactional
	public boolean checkLogin(User user) {

		return this.UserDAO.checkLogin(user);

	}

}
