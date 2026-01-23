package com.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestArrayList {
	public static void main(String[] args) {
		List<Integer> arrays = new ArrayList<Integer>();
		arrays.add(25);
		arrays.add(15);
		arrays.add(5);
		arrays.add(35);
		arrays.add(45);
		arrays.add(45);
		arrays.add(75);
		arrays.add(65);
		arrays.add(30);
		arrays.add(20);
		arrays.add(10);
		printElements(arrays);
		//removeElement(arrays, 35);
		arrays.remove(Integer.valueOf(15)); // remove the element 15
		arrays.remove(0); // removes the element at index 0
		printElements(arrays);
		removeElementByRange(arrays, 10, 40);
		printElements(arrays);
	}
	// remove the element in a range
	public static void removeElementByRange(List<Integer> list, int start, int end) {
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			int item = it.next(); // returns iterated element
			if(item >= start && item <= end) {
				it.remove(); // removes the iterated element
			}
		}
	}
	// removes the element
	public static void removeElement(List<Integer> list, Integer i) {
		list.remove(i);
	}
	// prints the element
	public static void printElements(List<Integer> list) {
		for(int item : list) {
			System.out.println(item);
		}
		System.out.println("_______________________");
	}
}
