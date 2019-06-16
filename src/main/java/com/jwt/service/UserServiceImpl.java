package com.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.UserDAO;
import com.jwt.model.User;
import com.jwt.model.Orders;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;

	@Override
	@Transactional
	public void addUser(User user) {
		userDAO.addUser(user);
	}

	@Override
	@Transactional
	public List<User> getAllUsers() {
		return userDAO.getAllUsers();
	}

	@Override
	@Transactional
	public void deleteUser(Integer userId) {
		userDAO.deleteUser(userId);
	}

	public User getUser(int empid) {
		return userDAO.getUser(empid);
	}

	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return userDAO.updateUser(user);
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

}
