package com.example.eCommerce.service;

import java.util.List;

import com.example.eCommerce.entity.Product;

public interface ProductService {

	public Product saveProduct(Product product);

	public List<Product> getAllProduct();

	public void deleteProductById(Integer productId);

	public List<Product> fetchProductByName(String productName);

}
