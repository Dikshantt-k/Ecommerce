package com.example.eCommerce.controller;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.eCommerce.entity.Cart;
import com.example.eCommerce.entity.CartItem;
import com.example.eCommerce.entity.Users;
import com.example.eCommerce.service.CartService;

@Controller
@RequestMapping("/cart/user")
public class CartController {
	
	@Autowired
	public CartService cartService;
	
	@PostMapping("/add")
	public List<Cart> addToCart(@RequestBody Users user,@RequestBody CartItem cartItem, @RequestBody String productName){
		return cartService.addToCart(user,cartItem,productName);
	}
	
}
