package com.omazon.service.util;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.omazon.service.dto.OrderDTO;
import com.omazon.service.dto.ProductDTO;
import com.omazon.service.entity.Order;
import com.omazon.service.entity.Product;

public class ServiceUtil {

	public static Order getOrderFromOrderDTO(OrderDTO orderDTO){
		Order order = null;
		if(orderDTO != null){
			order = new Order();
			order.setCreatedDate(new Date());
			order.setUpdatedDate(new Date());
			order.setOrder_description(orderDTO.getDescription());
			order.setProducts(getProductSetFrompProductsDTO(orderDTO.getProducts()));			
		}
		return order;
	}
	
	public static OrderDTO getOrderDTOFromOrder(Order order){
		OrderDTO orderDTO = new OrderDTO();
		if(order != null){
			orderDTO.setDescription(order.getOrder_description());
			orderDTO.setProducts(getProductDTOSetFrompProducts(order.getProducts()));
		}
		return orderDTO;
	}
	
	public static Set<Product> getProductSetFrompProductsDTO(Set<ProductDTO> productSet){
		Iterator<ProductDTO> pDtoItr = productSet.iterator();
		Set<Product> products = new HashSet<Product>();
		while(pDtoItr.hasNext())
		{
			ProductDTO p = pDtoItr.next();
			products.add(getProductFromProductDTO(p));
		}
		return products;
	}
	
	public static Product getProductFromProductDTO(ProductDTO productDTO){
		Product product = null;
		try{
			product = new Product();
			product.setAmount(productDTO.getAmount());
			product.setIsBook(productDTO.getIsBook());
			product.setCurrency(productDTO.getCurrency());
			//product.setBookEntity(productDTO.get);
			product.setLanguage(product.getLanguage());
			product.setProductName(product.getProductName());
			product.setProductType(product.getProductType());			
		}catch(Exception e){
			return product;
		}
		return product;
	}
	
	
	public static Set<ProductDTO> getProductDTOSetFrompProducts(Set<Product> productSet){
		Iterator<Product> pDtoItr = productSet.iterator();
		Set<ProductDTO> products = new HashSet<ProductDTO>();
		while(pDtoItr.hasNext())
		{
			Product p = pDtoItr.next();
			products.add(getProductDTOFromProduct(p));
		}
		return products;
	}
	
	public static ProductDTO getProductDTOFromProduct(Product product){
		ProductDTO productDTO = null;
		try{ 
			productDTO = new ProductDTO();
			productDTO.setAmount(product.getAmount());
			productDTO.setIsBook(product.getIsBook());
			productDTO.setCurrency(product.getCurrency());
			//product.setBookEntity(productDTO.get);
			productDTO.setLanguage(product.getLanguage());
			productDTO.setProductName(product.getProductName());
			productDTO.setProductType(product.getProductType());			
		}catch(Exception e){
			return productDTO;
		}
		return productDTO;
	}
}
