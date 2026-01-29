package com.examples;

import java.util.HashSet;
import java.util.Set;

public class TestProductSet {
	public static void main(String[] args) {
		Set<Product> products = new HashSet<Product>();
		products.add(new Product(777, "Laptop", 85000.0));
		products.add(new Product(555, "TV", 125000.0));
		products.add(new Product(666, "Mobile", 55000.0));
		products.add(new Product(666, "Mobile", 55000.0));
		products.add(new Product(222, "Camera", 165000.0));
		products.add(new Product(888, "Shoes", 5000.0));
		products.add(new Product(999, "Cooker", 2000.0));
		products.add(new Product(999, "Cooker", 2000.0));
		products.add(new Product(111, "Jacket", 2500.0));
		System.out.println("Size: "+products.size());
		printProducts(products);
	}
	public static void printProducts(Set<Product> set) {
		for(Product p : set) {
			System.out.println(p);
		}
	}
}
