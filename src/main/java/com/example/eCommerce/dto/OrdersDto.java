package com.example.eCommerce.dto;

import java.util.ArrayList;
import java.util.List;

public class OrdersDto {
	
	public int ordersId;
	public String emailId;
	public List<OrderItemDto> orderItem =new ArrayList<OrderItemDto>();
	public Double totalprice;
	public String  orderStatus;
	public int getOrdersId() {
		return ordersId;
	}
	public void setOrdersId(int ordersId) {
		this.ordersId = ordersId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public List<OrderItemDto> getOrderItem() {
		return orderItem;
	}
	public void setOrderItem(List<OrderItemDto> orderItem) {
		this.orderItem = orderItem;
	}
	public Double getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(Double totalprice) {
		this.totalprice = totalprice;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public OrdersDto(int ordersId, String emailId, List<OrderItemDto> orderItem, Double totalprice,
			String orderStatus) {
		super();
		this.ordersId = ordersId;
		this.emailId = emailId;
		this.orderItem = orderItem;
		this.totalprice = totalprice;
		this.orderStatus = orderStatus;
	}
	public OrdersDto() {
		super();
	}
	
	
	

}
