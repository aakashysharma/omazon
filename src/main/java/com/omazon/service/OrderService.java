package com.omazon.service;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.omazon.service.dto.OrderDTO;
import com.omazon.service.dto.ProductDTO;

@Service(value="orderService")
public interface OrderService {
	
	public OrderDTO sendOrder(Set<ProductDTO> products, String order_description);
	
	public OrderDTO getOrder(int orderId);
}
