package com.lioigor22.dao;

import java.util.List;

import com.lioigor22.objects.User;

public interface UserDAO {

	public void addUser(User p);

	public void updateUser(User p);

	public List<User> listUsers();

	public User getUserById(int id);

	public void removeUser(int id);

	public boolean checkUser(User user);

	public boolean checkLogin(User user);

}
