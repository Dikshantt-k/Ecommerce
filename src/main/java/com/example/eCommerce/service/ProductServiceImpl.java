package com.example.eCommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.eCommerce.entity.Product;
import com.example.eCommerce.repository.ProductRepository;

@Service

public class ProductServiceImpl implements ProductService {
	
	@Autowired
	public ProductRepository productRepository;

	@Override
	public Product saveProduct(Product product) {
		
		return productRepository.save(product) ;
	}

	@Override
	public List<Product> getAllProduct() {

		return productRepository.findAll();
	}

	@Override
	public void deleteProductById(Integer productId) {
		productRepository.deleteById(productId);
		
	}

	@Override
	public List<Product> fetchProductByName(String productName) {
		
		return productRepository.findByProductNameContainingIgnoreCase(productName);
	}

}
