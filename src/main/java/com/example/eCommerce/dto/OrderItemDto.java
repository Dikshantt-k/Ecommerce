package com.example.eCommerce.dto;

public class OrderItemDto {

	public int orderItemId;
	public String productName;
	public int quantity;
	public Double price;
	
	
	public int getOrderItemId() {
		return orderItemId;
	}
	public void setOrderItemId(int orderItemId) {
		this.orderItemId = orderItemId;
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
	public OrderItemDto(int orderItemId, String productName, int quantity, Double price) {
		super();
		this.orderItemId = orderItemId;
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}
	public OrderItemDto() {
		super();
	}
	
	
	
	
}
