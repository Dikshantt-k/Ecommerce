package com.example.eCommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.eCommerce.dto.ProductDto;
import com.example.eCommerce.entity.Product;
import com.example.eCommerce.repository.ProductRepository;
import com.example.eCommerce.service.ProductService;

@RestController
@RequestMapping("products")
public class ProductController {
	@Autowired
	public ProductService productService;
	
	
	@PostMapping("/save")
	public ResponseEntity<Product> saveProduct(@RequestBody  Product product) {
		Product products = productService.saveProduct(product);
		return new ResponseEntity<>(products,HttpStatus.CREATED);
	}
	
	
	@GetMapping("/getall")
	public ResponseEntity< List<ProductDto>>  getAllProducts() {
		List<ProductDto> products = productService.getAllProduct();
		return new ResponseEntity<>(products,HttpStatus.OK);
	}
	
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteProductById(@PathVariable("id") Integer ProductId ) {
		productService.deleteProductById(ProductId);
		return ResponseEntity.ok("Product Deleted");
	}
	
	
	@GetMapping("/name/{ProductName}")
	public ResponseEntity< List<ProductDto>> fetchProductByName(@PathVariable("ProductName") String productName){
		List<ProductDto> products = productService.fetchProductByName(productName);
		return new ResponseEntity<>(products,HttpStatus.OK);
	}
	
	@PostMapping("/update/{id}")
	public ResponseEntity<ProductDto> updateProduct(@PathVariable int id,@RequestBody Product product){
		ProductDto uProduct = productService.updateProduct(id,product);
		return new ResponseEntity<>(uProduct,HttpStatus.OK);
	}
}
