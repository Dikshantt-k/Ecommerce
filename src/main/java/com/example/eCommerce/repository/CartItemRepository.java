package com.example.eCommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.eCommerce.entity.CartItem;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Integer> {

}
