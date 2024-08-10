package com.example.eCommerce.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.eCommerce.dto.CartDto;
import com.example.eCommerce.dto.CartItemDto;
import com.example.eCommerce.service.CartService;

@Controller
@RequestMapping("/cart/user")
public class CartController {
	
	@Autowired
	public CartService cartService;
	
	@PostMapping("/add/cart/{userId}/products/{productId}/quantity/{quantity}")
	public ResponseEntity<CartDto> addToCart(@PathVariable int userId,@PathVariable int productId,@PathVariable int quantity){
		
		CartDto cartitem = cartService.addToCart(userId,productId,quantity);
		return new ResponseEntity<>(cartitem,HttpStatus.CREATED);
	}
	
	
	@DeleteMapping("/delete/cart/{userId}/products/{productId}")
	public ResponseEntity<String> deleteItemFromCart(@PathVariable("userId") Integer userId , @PathVariable("productId") Integer productId) {
		
		cartService.deleteItemFromCart(userId,productId);
		return ResponseEntity.ok("Item deleted !!!");
	}
	
	
	@GetMapping("/getAllCartItem/cart/{userId}")
	public ResponseEntity< List<CartItemDto>> getAllItemFroCart(@PathVariable int userId) {
		
		List<CartItemDto> cartItem =cartService.getAllItemFromCart(userId);
		return new ResponseEntity<>(cartItem,HttpStatus.OK);
		
	}
	
	
	@PostMapping("/updateCartItem/user/{userId}/product/{productId}/quantity/{quantity}")
	public ResponseEntity<CartItemDto> updateCartItem(@PathVariable int userId, @PathVariable int productId,@PathVariable int quantity ){
		CartItemDto cid = cartService.updateCartItem(userId,productId,quantity);
		return new ResponseEntity<>(cid,HttpStatus.OK);
	}
	
}
