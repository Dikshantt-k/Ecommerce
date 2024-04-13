package com.example.eCommerce.entity;

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
	
	@OneToOne
	private Cart cart;
}
