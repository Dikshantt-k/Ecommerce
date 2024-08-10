package com.example.eCommerce.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
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
	public Users user;
	
	@OneToMany(mappedBy = "cart",cascade = CascadeType.ALL)
	private List<CartItem> cartItem = new ArrayList<>();
	
	private Double totalPrice;

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public List<CartItem> getCartItem() {
		return cartItem;
	}

	public void setCartItem(List<CartItem> cartItem) {
		this.cartItem = cartItem;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Cart(int cartId, Users user, List<CartItem> cartItem, Double totalPrice) {
		super();
		this.cartId = cartId;
		this.user = user;
		this.cartItem = cartItem;
		this.totalPrice = totalPrice;
	}

	public Cart() {
		super();
	}
	 

}
