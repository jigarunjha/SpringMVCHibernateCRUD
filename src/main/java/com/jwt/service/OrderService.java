package com.jwt.service;

import java.util.List;

import com.jwt.model.Orders;

public interface OrderService {
	
	public void addOrder(Orders order);

	public List<Orders> getAllOrders();

	public void deleteOrder(Integer orderId);

	public Orders getOrder(int orderid);

	public Orders updateOrder(Orders order);
	
	public List<Orders> getOrdersByUserId(int userId);
}
