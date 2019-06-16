package com.jwt.dao;

import java.util.List;
import com.jwt.model.Orders;

public interface OrderDAO {

	public void addOrder(Orders order);

	public List<Orders> getAllOrders();

	public void deleteOrder(Integer orderId);

	public Orders updateOrder(Orders order);

	public Orders getOrder(int orderid);
	
	public List<Orders> getOrdersByUserId(int userId);
}
