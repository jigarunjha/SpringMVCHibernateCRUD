package com.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.OrderDAO;
import com.jwt.model.Orders;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDAO orderDAO;

	@Override
	@Transactional
	public List<Orders> getOrdersByUserId(int userId) {
	
		return orderDAO.getOrdersByUserId(userId);
	}
	
	@Override
	@Transactional
	public void addOrder(Orders user) {
		orderDAO.addOrder(user);
	}

	@Override
	@Transactional
	public List<Orders> getAllOrders() {
		return orderDAO.getAllOrders();
	}

	@Override
	@Transactional
	public void deleteOrder(Integer orderId) {
		orderDAO.deleteOrder(orderId);
	}

	public Orders getOrder(int empid) {
		return orderDAO.getOrder(empid);
	}

	public Orders updateOrder(Orders order) {
		// TODO Auto-generated method stub
		return orderDAO.updateOrder(order);
	}

	public void setOrderDAO(OrderDAO orderDAO) {
		this.orderDAO = orderDAO;
	}

}
