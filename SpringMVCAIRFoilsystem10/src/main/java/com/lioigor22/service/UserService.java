package com.lioigor22.service;

import java.util.List;

import com.lioigor22.objects.User;

public interface UserService {

	public void addUser(User user);

	public void updateUser(User user);

	public List<User> listUsers();

	public User getUserById(int id);

	public void removeUser(int id);

	public boolean checkUser(User user);

	public boolean checkLogin(User user);

}
