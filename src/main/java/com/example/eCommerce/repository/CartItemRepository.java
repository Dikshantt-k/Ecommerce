package com.example.eCommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.eCommerce.entity.CartItem;
import com.example.eCommerce.entity.Product;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Integer> {

	public void deleteCartItemByCartCartIdAndProductProductId(int cartItemId, int productId);

	public List<CartItem> findByCartCartId(int cartId);

	public void deleteByCartCartId(int cartId);
	
	public CartItem findCartItemByProductProductIdAndCartCartId(int cartId,int  productId); 
	
	
}
