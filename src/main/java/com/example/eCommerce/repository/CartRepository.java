package com.example.eCommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.eCommerce.entity.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {

	public Cart findByUserUserId(int userId);

}
