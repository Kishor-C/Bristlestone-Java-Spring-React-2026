package com.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestCustomTypeSorting {
	public static void main(String[] args) {
		List<Product> products = new ArrayList<Product>();
		products.add(new Product(777, "Laptop", 85000.0));
		products.add(new Product(555, "TV", 125000.0));
		products.add(new Product(666, "Mobile", 55000.0));
		products.add(new Product(222, "Camera", 165000.0));
		products.add(new Product(888, "Shoes", 5000.0));
		products.add(new Product(999, "Cooker", 2000.0));
		products.add(new Product(111, "Jacket", 2500.0));
		printProducts(products);
		System.out.println("***** Natural Sorting ****");
		Collections.sort(products); // newId - sortedId -> 555, 666, 777
		printProducts(products);

		System.out.println("***** Custom Sorting by name****");
		Collections.sort(products, new Product.SortByName());
		printProducts(products);
		
		System.out.println("***** Custom Sorting by price****");
		Collections.sort(products, new Product.SortByPrice());
		printProducts(products);
		
		// anonymous implementation of Comparator
		Comparator<Product> compareNameDesc = new Comparator<Product>() {
			// comparing for descending order
			@Override
			public int compare(Product o1, Product o2) {
				return o2.getName().compareTo(o1.getName());
			}
		};
		System.out.println("***** Custom Sorting by name in desc****");
		Collections.sort(products, compareNameDesc);
		printProducts(products);
		/*
		 *  create anonymous implementation for price in descending order, 
		 *  then pass it to the sort & call printProducts
		 */
		
	}
	public static void printProducts(List<Product> list) {
		System.out.println("*************List of Products********************");
		for(Product product : list) {
			System.out.println(product);
		}
		System.out.println("______________________________________________________");
	}
	
}
