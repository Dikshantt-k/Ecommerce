package com.example.eCommerce.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.example.eCommerce.dto.CartItemDto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Orders {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int orderId;
	public String userName;
	
//	@OneToMany(mappedBy = "order",cascade = CascadeType.ALL)
//	public List<OrderItem> orderItem = new ArrayList<>();
	
	public Double totalPrice;
	public String status;
	@OneToMany(mappedBy = "order",cascade = CascadeType.ALL)
	public List<OrderItem> orderItem = new ArrayList<>();
	
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public List<OrderItem> getOrderItem() {
		return orderItem;
	}
	public void setOrderItem(List<OrderItem> orderItem) {
		this.orderItem = orderItem;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Orders(int orderId, String userName, List<OrderItem> orderItem, Double totalPrice, String status) {
		super();
		this.orderId = orderId;
		this.userName = userName;
		this.orderItem = orderItem;
		this.totalPrice = totalPrice;
		this.status = status;
	}
	public Orders() {
		super();
	}

	

}
