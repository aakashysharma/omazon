package com.omazon.service.impl;

import java.util.Set;

import javax.annotation.Resource;

import com.omazon.service.OrderService;
import com.omazon.service.dao.OrderDAO;
import com.omazon.service.dto.OrderDTO;
import com.omazon.service.dto.ProductDTO;
import com.omazon.service.entity.Order;
import com.omazon.service.util.ServiceUtil;

public class OrderServiceImpl implements OrderService {

	@Resource
	private OrderDAO orderDAO;
	
	@Override
	public OrderDTO sendOrder(Set<ProductDTO> products, String order_description) {
		OrderDTO orderDTo = new OrderDTO();
		orderDTo.setProducts(products);
		orderDTo.setDescription(order_description);
		Order order =ServiceUtil.getOrderFromOrderDTO(orderDTo);
		boolean flag = orderDAO.save(order);
		if(flag == true){
			return orderDTo;
		}else{
			return null;
		}
	}

	@Override
	public OrderDTO getOrder(int orderId) {
		OrderDTO orderDTO = null;
		if(orderId > 0){
			Order order = orderDAO.getOrder(orderId);
			orderDTO = ServiceUtil.getOrderDTOFromOrder(order);
		}
		return orderDTO;
	}

}
