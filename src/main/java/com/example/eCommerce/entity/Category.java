package com.example.eCommerce.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int categoryId;
	
	public String categoryname;
	
	@OneToMany(mappedBy = "category",cascade = CascadeType.ALL)
	public List<Product> products ;

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryname() {
		return categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Category(int categoryId, String categoryname, List<Product> products) {
		super();
		this.categoryId = categoryId;
		this.categoryname = categoryname;
		this.products = products;
	}

	public Category() {
		super();
	}
	
	

}
