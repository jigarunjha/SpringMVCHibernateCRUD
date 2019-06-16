package com.jwt.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.model.Orders;

@Repository
@Transactional
public class OrderDAOImpl implements OrderDAO {

	@Autowired
	private SessionFactory sessionFactory;

	
	@SuppressWarnings("unchecked")
	public List<Orders> getOrdersByUserId(int userId) {
		
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Orders.class);
		List<Orders> list = criteria.add(Restrictions.eq("purchasedBy", userId)).list();
		return list;
	}
	
	public void addOrder(Orders order) {
		sessionFactory.getCurrentSession().saveOrUpdate(order);

	}

	@SuppressWarnings("unchecked")
	public List<Orders> getAllOrders() {

		return sessionFactory.getCurrentSession().createQuery("from Orders").list();
	}

	@Override
	public void deleteOrder(Integer orderId) {
		Orders order = (Orders) sessionFactory.getCurrentSession().load(
				Orders.class, orderId);
		if (null != order) {
			this.sessionFactory.getCurrentSession().delete(order);
		}

	}

	public Orders getOrder(int empid) {
		return (Orders) sessionFactory.getCurrentSession().get(
				Orders.class, empid);
	}

	@Override
	public Orders updateOrder(Orders order) {
		sessionFactory.getCurrentSession().update(order);
		return order;
	}

}