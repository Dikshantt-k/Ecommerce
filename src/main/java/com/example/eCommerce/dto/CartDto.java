package com.example.eCommerce.dto;

public class CartDto {
	public int cartId;
	public String userName;
	public String productName;
	public Double price;
	public int quantity;
	
	
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public CartDto(int cartId, String userName, String productName, Double price, int quantity) {
		super();
		this.cartId = cartId;
		this.userName = userName;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	public CartDto() {
		super();
	}
	
	
}
