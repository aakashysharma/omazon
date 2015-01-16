package com.omazon.service.dao;

import org.springframework.stereotype.Repository;

import com.omazon.service.entity.Order;

@Repository(value="orderDAO")
public interface OrderDAO {
	
	public boolean save(Order orderEntity);
	public Order getOrder(int orderId);
}
