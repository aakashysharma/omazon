package com.omazon.service.dto;

import java.util.Set;

public class OrderDTO implements IsDTO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer orderId;
	private Set<ProductDTO> products;
	private String description;
			
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Set<ProductDTO> getProducts() {
		return products;
	}
	public void setProducts(Set<ProductDTO> products) {
		this.products = products;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}	
}
