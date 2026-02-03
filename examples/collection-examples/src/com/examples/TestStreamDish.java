package com.examples;

import java.util.List;

public class TestStreamDish {
	public static void main(String[] args) {
		// Immutable List that can't be modified
		List<Dish> list = List.of(

				new Dish("Biryani", 200, 4.9, "Veg"),
				new Dish("Chicken Biryani", 300, 4.8, "Non Veg"),
				new Dish("Chicken Tandoor", 250, 4.3, "Non Veg"),
				new Dish("Kichadi", 200, 4.0, "Veg"),
				new Dish("Palak Kichadi", 220, 4.3, "Veg"),
				new Dish("Fried Rice", 220, 3.9, "Non Veg"),
				new Dish("Fried Rice", 200, 4.5, "Veg")
				);
		// filter non veg dish, rating > 4.0, sort based on rate
		List<Dish> nonVegRatingGt4 = list.stream()
				.filter(dish -> dish.getType().equalsIgnoreCase("non veg"))
				.filter(dish -> dish.getRatings() > 4.0)
				.sorted((dish1, dish2) -> Double.compare(dish1.getPrice(), dish2.getPrice()))
				.toList();
		// simplest way to iterate with lambda forEach(Consumer), Consumer -> void accept(T t)
		nonVegRatingGt4.forEach(dish -> System.out.println(dish));
				
	}
}
