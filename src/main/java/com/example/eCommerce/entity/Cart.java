package com.example.eCommerce.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
	
	@Id
	@GeneratedValue(strategy =   GenerationType.AUTO)
	private int cartId;
	
	@OneToOne
	private Users user;
	
	@OneToMany(mappedBy = "cart")
	private List<CartItem> cartItem = new ArrayList<>();
	
	private int totalPrice;
	 

}
