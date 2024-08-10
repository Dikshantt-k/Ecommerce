package com.example.eCommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.eCommerce.dto.OrdersDto;
import com.example.eCommerce.entity.OrderItem;
import com.example.eCommerce.service.OrderService;

@RequestMapping("/user/order")
@RestController
public class OrderController {
	
	@Autowired
	public OrderService orderService;
	
	@PostMapping("/placeOrder/{userId}")
	public ResponseEntity< OrdersDto > placeOrder(@PathVariable int userId){
		OrdersDto orders = orderService.placeOrder(userId);
		return new ResponseEntity<>(orders,HttpStatus.OK);
	}
	
	
	@PostMapping("/rateProduct/user/{orderId}/product/{productId}")
	public ResponseEntity<String> ratePurchesProduct(@PathVariable int ordersId,@PathVariable int productId){
		String rating=orderService.ratePurchesProduct(ordersId,productId);
		return new ResponseEntity<>(rating,HttpStatus.OK);
		
	}
	
	
	
}
