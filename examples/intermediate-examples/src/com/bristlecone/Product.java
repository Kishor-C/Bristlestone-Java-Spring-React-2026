package com.bristlecone;

import java.io.Serializable;

public class Product implements Serializable {
	
	private String name;
	private double price;
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	
	
}
