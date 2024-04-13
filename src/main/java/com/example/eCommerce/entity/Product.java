package com.example.eCommerce.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	
	@Id
	@GeneratedValue(strategy =   GenerationType.AUTO)
	private int productId;
	private String productName;
	private String description;
	private Double price;
	private Double discount;
	private Double deliveryCharges;
	private int avgRating;
	private String sellerName;
	
//	@OneToMany(mappedBy = "product")
//	private CartItem cartItem;

}
