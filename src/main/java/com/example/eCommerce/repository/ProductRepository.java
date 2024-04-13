package com.example.eCommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.eCommerce.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	public List<Product> findByProductNameContainingIgnoreCase(String productName);

}
