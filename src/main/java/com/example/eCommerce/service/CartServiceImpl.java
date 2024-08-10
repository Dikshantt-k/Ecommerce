package com.example.eCommerce.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.eCommerce.dto.CartDto;
import com.example.eCommerce.dto.CartItemDto;
import com.example.eCommerce.entity.Cart;
import com.example.eCommerce.entity.CartItem;
import com.example.eCommerce.entity.Product;
import com.example.eCommerce.entity.Users;
import com.example.eCommerce.repository.CartItemRepository;
import com.example.eCommerce.repository.CartRepository;
import com.example.eCommerce.repository.ProductRepository;
import com.example.eCommerce.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CartServiceImpl implements CartService{
	@Autowired
	public CartRepository cartRepository;
	@Autowired
	public CartItemRepository cartItemRepository;
	@Autowired
	public ProductRepository productRepository;
	@Autowired
	public UserRepository userRepository;
	
	
	
	
	
	
	@Override
	public CartDto addToCart(int userId, int productId, int quantity) {
		
		Users user = userRepository.findById(userId).get();
		Cart cart = cartRepository.findByUserUserId(userId);
		Product product = productRepository.findById(productId).get();
		
	
		CartItem newCartItem = new CartItem();

		newCartItem.setQuantity(quantity);
		newCartItem.setCart(cart);
		newCartItem.setProduct(product);
		
		cart.setTotalPrice(cart.getTotalPrice()+product.getPrice());
		
		cartItemRepository.save(newCartItem);
		
		CartDto cartDto = new CartDto();
		cartDto.setCartId(cart.getCartId());
		cartDto.setUserName(user.getUserName());
		cartDto.setProductName(product.getProductName());
		cartDto.setPrice(product.getPrice());
		cartDto.setQuantity(quantity);
		
		return cartDto;

	}

	@Override
	public void deleteItemFromCart(int userId, int productId) {
		
		Cart cart = cartRepository.findByUserUserId(userId);
		CartItem cartItem =cartItemRepository.findCartItemByProductProductIdAndCartCartId( productId,cart.getCartId());
		Product product=productRepository.findById(productId).get();
		cart.setTotalPrice(cart.getTotalPrice() - (cartItem.getQuantity()*product.getPrice()) );
		
		cartRepository.save(cart);
		
		cartItemRepository.deleteCartItemByCartCartIdAndProductProductId(cart.getCartId(),productId);		
		
	}

	@Override
	public List<CartItemDto> getAllItemFromCart(int userId) {
		Cart cart = cartRepository.findByUserUserId(userId);
		List<CartItem> cartItem = cartItemRepository.findByCartCartId(cart.getCartId());
		
		List<CartItemDto> cartItemDto = new ArrayList<>();
		
		
		for(CartItem c :cartItem ) {
			CartItemDto cid = new CartItemDto();
			cid.setCartItemId(c.getCartItemId());
			cid.setProductName(c.getProduct().getProductName());
			cid.setPrice(c.getProduct().getPrice());
			cid.setQuantity(c.getQuantity());
			cartItemDto.add(cid);
			}
		
		return cartItemDto;
		
	}

	@Override
	public CartItemDto updateCartItem(int userId, int productId, int quantity) {
		Cart cart = cartRepository.findByUserUserId(userId);
		Product product = productRepository.findById(productId).get();
		CartItem cartItem =cartItemRepository.findCartItemByProductProductIdAndCartCartId( productId,cart.getCartId());
		
		cartItem.setQuantity(cartItem.getQuantity()+quantity);
		cart.setTotalPrice(cart.getTotalPrice()+(quantity*product.getPrice()));
		cartRepository.save(cart);
		cartItemRepository.save(cartItem);
		
		CartItemDto cid = new CartItemDto();
		cid.setCartItemId(cartItem.getCartItemId());
		cid.setProductName(product.getProductName());
		cid.setPrice(quantity*product.getPrice());
		cid.setQuantity(cartItem.getQuantity());
		return cid;
	}
	
	



}
