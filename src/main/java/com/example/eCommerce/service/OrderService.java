package com.example.eCommerce.service;

import java.util.List;

import org.springframework.data.domain.jaxb.SpringDataJaxb.OrderDto;

import com.example.eCommerce.dto.OrdersDto;
import com.example.eCommerce.entity.OrderItem;

public interface OrderService {

	public OrdersDto placeOrder(int userId);

	public String ratePurchesProduct(int ordersId, int productId);

}
