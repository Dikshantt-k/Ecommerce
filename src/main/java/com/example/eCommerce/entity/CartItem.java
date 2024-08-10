package com.example.eCommerce.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartItem {
	
	@Id
	@GeneratedValue(strategy =   GenerationType.AUTO)
	private int cartItemId;
	private int quantity;
	
	@ManyToOne
	private Cart cart;
	
	@ManyToOne
	private Product product;

	
	public int getCartItemId() {
		return cartItemId;
	}

	public void setCartItemId(int cartItemId) {
		this.cartItemId = cartItemId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public CartItem(int cartItemId, int quantity, Cart cart, Product product) {
		super();
		this.cartItemId = cartItemId;
		this.quantity = quantity;
		this.cart = cart;
		this.product = product;
	}

	public CartItem() {
		super();
	}

	@Override
	public String toString() {
		return "CartItem [cartItemId=" + cartItemId + ", quantity=" + quantity + ", cart=" + cart + ", product="
				+ product + "]";
	}
	
//	@ManyToOne
//	private Product product;
	
	
	
}
