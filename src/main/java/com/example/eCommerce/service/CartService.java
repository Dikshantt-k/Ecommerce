package com.example.eCommerce.service;

import java.util.List;

import com.example.eCommerce.dto.CartDto;
import com.example.eCommerce.dto.CartItemDto;


public interface CartService {

	

	public CartDto addToCart(int userId, int productId, int quantity);

	public void deleteItemFromCart(int userId, int productId);

	public List<CartItemDto> getAllItemFromCart(int cartItemId);

	public CartItemDto updateCartItem(int userId, int productId, int quantity);

}
