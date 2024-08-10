package com.example.eCommerce.dto;

public class CartItemDto {
	public int cartItemId;
	public String productName;
	public int quantity;
	public Double price;
	
	
	public int getCartItemId() {
		return cartItemId;
	}
	public void setCartItemId(int cartItemId) {
		this.cartItemId = cartItemId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public CartItemDto(int cartItemId, String productName, int quantity, Double price) {
		super();
		this.cartItemId = cartItemId;
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}
	public CartItemDto() {
		super();
	}
	
	
}
