package com.example.eCommerce.service;

import java.util.List;

import com.example.eCommerce.dto.ProductDto;
import com.example.eCommerce.entity.Product;

public interface ProductService {

	public Product saveProduct(Product product);

	public List<ProductDto> getAllProduct();

	public void deleteProductById(Integer productId);

	public List<ProductDto> fetchProductByName(String productName);

	public ProductDto updateProduct(int id, Product product);

}
