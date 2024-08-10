package com.example.eCommerce.dto;



public class ProductDto {

	public int productId;
	public String productName;
	public String description;
	public Double price;
	public Double discount;
	public int avgRating;
	public int quantity;
	public String sellerName;
	
	
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	public int getAvgRating() {
		return avgRating;
	}
	public void setAvgRating(int avgRating) {
		this.avgRating = avgRating;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public ProductDto(int productId, String productName, String description, Double price, Double discount,
			int avgRating, int quantity, String sellerName) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.description = description;
		this.price = price;
		this.discount = discount;
		this.avgRating = avgRating;
		this.quantity = quantity;
		this.sellerName = sellerName;
	}
	public ProductDto() {
		super();
	}
	
	
}
