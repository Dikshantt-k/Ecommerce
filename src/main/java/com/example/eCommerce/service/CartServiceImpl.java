package com.example.eCommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.eCommerce.entity.Cart;
import com.example.eCommerce.entity.CartItem;
import com.example.eCommerce.entity.Product;
import com.example.eCommerce.entity.Users;
import com.example.eCommerce.repository.CartItemRepository;
import com.example.eCommerce.repository.CartRepository;
import com.example.eCommerce.repository.ProductRepository;

@Service
public class CartServiceImpl implements CartService{
	@Autowired
	public CartRepository cartRepository;
	@Autowired
	public CartItemRepository cartItemRepository;
	@Autowired
	public ProductRepository productRepository;
	
	

	@Override
	public List<Cart> addToCart(Users user, CartItem cartItem, String productName) {
		
		List<Product> product = productRepository.findByProductNameContainingIgnoreCase( productName);
		
		
		
		
		
		
		
		
		return null;
	}

}
