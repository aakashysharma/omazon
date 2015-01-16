package com.omazon.service.dao.impl;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;

import com.omazon.service.dao.OrderDAO;
import com.omazon.service.entity.Order;

public class OrderDAOImpl implements OrderDAO{

	@Resource
	private SessionFactory sessionFactory;
	
	@Override
	public boolean save(Order orderEntity) {
		if(orderEntity != null){
			try{
				sessionFactory.getCurrentSession().save(orderEntity);
				return true;
			}catch(Exception e){
				return false;
			}
		}
		return false;
	}

	@Override
	public Order getOrder(int orderId) {
		if(orderId > 0){
			try{
				Order order = (Order) sessionFactory.getCurrentSession().get(Order.class,orderId);
				return order;
			}catch(Exception e){
				return null;
			}
		}
		return null;
	}
}
