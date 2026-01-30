package com.examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMap {
	public static void main(String[] args) {
		/*
		 * put(K, V): To store the data 
		 * get(K): To read the data based on the key
		 * remove(K): To remove the data based on the key
		 * replace(K, V): To replace the data 
		 * containsKey(K): To check key is present or not
		 * keySet(): To read all the keys and refer it using Set<K>
		 */
		// Map stores id and name where id is unique
		Map<Integer, String> userMap = new HashMap<Integer, String>();
		// Inserting the data
		userMap.put(101, "Raj");
		userMap.put(200, "Vikas");
		userMap.put(150, "Sachin");
		userMap.put(170, "Alex");
		// Reading the data based on the key
		String name = userMap.get(200);
		System.out.println("Name = "+name);
		// Update the data based on the key
		if(userMap.containsKey(200)) {
			userMap.replace(200, "Vijay");
		}
		name = userMap.get(200);
		System.out.println("Name after updade = "+name);
		// Deleting the data based on the key
		userMap.remove(200);
		name = userMap.get(200);
		System.out.println("Name after remove = "+name);
		// to iterate all the data you can use keySet() that returns Set<K>
		Set<Integer> keys = userMap.keySet();
		System.out.println("****** Printing all the keys & value *******");
		for(Integer key : keys) {
			System.out.println(key+"=>"+userMap.get(key));
		}
	}
}
