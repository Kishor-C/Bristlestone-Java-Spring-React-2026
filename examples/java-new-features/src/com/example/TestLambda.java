package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestLambda {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(4);
		list.add(3);
		System.out.println(list);
		// sort
//		Collections.sort(list, new Comparator<>(){
//			public int compare(Integer x, Integer y) {
//				return Integer.compare(y, x);
//			}
//		});
		Collections.sort(list, (x, y) -> Integer.compare(y, x));
		System.out.println(list);
		List<String> names = new ArrayList<>();
		names.add("Sourav");
		names.add("Ajay");
		names.add("Vijay");
		names.add("Mohit");
		System.out.println(names);
		Collections.sort(names, (x, y) -> y.compareTo(x));
		System.out.println(names);
	}
}
