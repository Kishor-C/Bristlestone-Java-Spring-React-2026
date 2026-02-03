package com.examples;

public class Dish {
	private String name;
	private double price;
	private double ratings;
	private String type;
	public Dish(String name, double price, double ratings, String type) {
		super();
		this.name = name;
		this.price = price;
		this.ratings = ratings;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Dish [name=" + name + ", price=" + price + ", ratings=" + ratings + ", type=" + type + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getRatings() {
		return ratings;
	}
	public void setRatings(double ratings) {
		this.ratings = ratings;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
