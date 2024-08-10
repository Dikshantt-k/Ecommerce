package com.example.eCommerce.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.eCommerce.dto.ProductDto;
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
	public List<ProductDto> getAllProduct() {
		
	List<Product> pdfromDb=productRepository.findAll();	
	List<ProductDto> pdto =	new ArrayList<>();
	
	for(Product p : pdfromDb) {
		ProductDto productDto =new ProductDto(
									p.getProductId(),
									p.getProductName(),
									p.getDescription(),
									p.getPrice(),
									p.getDiscount(),
									p.getAvgRating(),
									p.getQuantity(),
									p.getSellerName());
			pdto.add(productDto);
		}
		
		return pdto;
	}

	@Override
	public void deleteProductById(Integer productId) {
		productRepository.deleteById(productId);
		
	}

	@Override
	public List<ProductDto> fetchProductByName(String productName) {
		
		List<Product> pFromDb = productRepository.findByProductNameContainingIgnoreCase(productName);
		List<ProductDto> pDto = new ArrayList<>();
		
		for (Product p : pFromDb) {
			ProductDto productDto = new ProductDto(
										p.getProductId(),
										p.getProductName(),
										p.getDescription(),
										p.getPrice(),
										p.getDiscount(),
										p.getAvgRating(),
										p.getQuantity(),
										p.getSellerName());
			pDto.add(productDto);
		}
		
		return pDto;
	}

	
	@Override
	public ProductDto updateProduct(int id, Product product) {
		Product pdFromDb = productRepository.findById(id).get();
		
		
		if(Objects.nonNull(product.getProductName())&&
				!"".equalsIgnoreCase(product.getProductName())) {
			pdFromDb.setProductName(product.getProductName());
			
		}
		if(Objects.nonNull(product.getDescription())&&
				!"".equalsIgnoreCase(product.getDescription())) {
			pdFromDb.setDescription(product.getDescription());
			
		}		
		if(Objects.nonNull(product.getPrice())&&
				!"".equals(product.getPrice())) {
			pdFromDb.setPrice(product.getPrice());
			
		}		
		if(Objects.nonNull(product.getDiscount())&&
				!"".equals(product.getDiscount())) {
			pdFromDb.setDiscount(product.getDiscount());
			
		}		
		if(Objects.nonNull(product.getAvgRating())&&
				!"".equals(product.getAvgRating())) {
			pdFromDb.setAvgRating(product.getAvgRating());
			
		}		
		if(Objects.nonNull(product.getQuantity())&&
				!"".equals(product.getQuantity())) {
			pdFromDb.setQuantity(product.getQuantity());
			
		}		
		if(Objects.nonNull(product.getSellerName())&&
				!"".equalsIgnoreCase(product.getSellerName())) {
			pdFromDb.setSellerName(product.getSellerName());
			
		}
		productRepository.save(pdFromDb);
		
		ProductDto pDto = new ProductDto();
		pDto.setProductName(pdFromDb.getProductName());
		pDto.setDescription(pdFromDb.getDescription());
		pDto.setPrice(pdFromDb.getPrice());
		pDto.setDiscount(pdFromDb.getDiscount());
		pDto.setAvgRating(pdFromDb.getAvgRating());
		pDto.setQuantity(pdFromDb.getQuantity());
		pDto.setSellerName(pdFromDb.getSellerName());
		
		return pDto;
	}

}
