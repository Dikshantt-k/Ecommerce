package com.example.eCommerce.service;

import java.util.List;

import com.example.eCommerce.entity.Cart;
import com.example.eCommerce.entity.CartItem;
import com.example.eCommerce.entity.Users;

public interface CartService {

	public List<Cart> addToCart(Users user, CartItem cartItem, String productName);

}
