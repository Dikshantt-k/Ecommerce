package com.example.eCommerce.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	
	@Id
	@GeneratedValue(strategy =   GenerationType.AUTO)
	public int productId;
	public String productName;
	public String description;
	public Double price;
	public Double discount;
	public int avgRating;
	private int quantity;
	public String sellerName;
	
	@OneToMany(mappedBy = "product",cascade = CascadeType.ALL)
	private List<CartItem> products = new ArrayList<>();
	
	@OneToMany(mappedBy = "product",cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	public List< OrderItem> orderItem = new ArrayList<>();
	
	@ManyToOne
	public Category category;

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

	public List<CartItem> getProducts() {
		return products;
	}

	public void setProducts(List<CartItem> products) {
		this.products = products;
	}

	public List<OrderItem> getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(List<OrderItem> orderItem) {
		this.orderItem = orderItem;
	}

	public Product(int productId, String productName, String description, Double price, Double discount, int avgRating,
			int quantity, String sellerName, List<CartItem> products, List<OrderItem> orderItem) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.description = description;
		this.price = price;
		this.discount = discount;
		this.avgRating = avgRating;
		this.quantity = quantity;
		this.sellerName = sellerName;
		this.products = products;
		this.orderItem = orderItem;
	}

	public Product() {
		super();
	}

	
	
}
