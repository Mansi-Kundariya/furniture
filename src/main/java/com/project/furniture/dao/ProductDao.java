package com.project.furniture.dao;

import org.springframework.lang.NonNull;

import com.project.furniture.model.Product;

public class ProductDao {
	private Integer id;
	private @NonNull String name;
	private @NonNull String imageUrl;
	private @NonNull int quantity;
	private @NonNull double price;
	private String description;
	
	public ProductDao(String name, String imageUrl, int quantity, double price, String description) {
		super();
		this.name = name;
		this.imageUrl = imageUrl;
		this.quantity = quantity;
		this.price = price;
		this.description = description;
	}
	public ProductDao(Product product)
	{
		super();
		this.name = product.getName();
		this.imageUrl = product.getImageURL();
		this.quantity = product.getQuantity();
		this.price = product.getPrice();
		this.description = product.getDescription();
	}

	public ProductDao() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
