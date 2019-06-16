package com.jwt.service;

import java.util.List;

import com.jwt.model.User;

public interface UserService {
	
	public void addUser(User user);

	public List<User> getAllUsers();

	public void deleteUser(Integer userId);

	public User getUser(int userId);

	public User updateUser(User user);


}
