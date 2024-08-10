package com.example.eCommerce.entity;

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
public class Users {
	
	@Id
	@GeneratedValue(strategy =   GenerationType.AUTO)
	private int userId;
	private String userName;
	private String emailId;
	private String password;
	
	@OneToOne(mappedBy = "user", cascade = { CascadeType.PERSIST, CascadeType.MERGE,CascadeType.ALL }, orphanRemoval = true)
	private Cart cart;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userName=" + userName + ", emailId=" + emailId + ", password=" + password
				+ ", cart=" + cart + "]";
	}

	public Users(int userId, String userName, String emailId, String password, Cart cart) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.emailId = emailId;
		this.password = password;
		this.cart = cart;
	}

	public Users() {
		super();
	}
	
	
}
