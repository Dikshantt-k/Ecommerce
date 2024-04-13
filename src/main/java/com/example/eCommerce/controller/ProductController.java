package com.example.eCommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.eCommerce.entity.Product;
import com.example.eCommerce.service.ProductService;

@RestController
@RequestMapping("products")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	
	@PostMapping("/save")
	public Product saveProduct(@RequestBody  Product product) {
		return productService.saveProduct(product);
		
	}
	
	@GetMapping("/getall")
	public List<Product>  getAllProducts() {
		return productService.getAllProduct();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteProductById(@PathVariable("id") Integer ProductId ) {
		productService.deleteProductById(ProductId);
		return "Product Deleted";
	}
	
	@GetMapping("/name/{ProductName}")
	public List<Product> fetchProductByName(@PathVariable("ProductName") String productName){
		return productService.fetchProductByName(productName);
	}
	

}
