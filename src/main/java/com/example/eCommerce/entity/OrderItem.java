package com.example.eCommerce.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class OrderItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int orderItemId;
	
	@ManyToOne
	public Product product;
	
	@ManyToOne
	public Orders order;
	
	public int quantity;
	
	public Double price;

	public int getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(int orderItemId) {
		this.orderItemId = orderItemId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
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

	public OrderItem(int orderItemId, Product product, Orders order, int quantity, Double price) {
		super();
		this.orderItemId = orderItemId;
		this.product = product;
		this.order = order;
		this.quantity = quantity;
		this.price = price;
	}

	public OrderItem() {
		super();
	}
	

}
