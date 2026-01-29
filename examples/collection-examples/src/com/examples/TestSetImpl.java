package com.examples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSetImpl {
	public static void main(String[] args) {
		Set<Integer> set;
		//set = new HashSet<Integer>();
		//set = new LinkedHashSet<Integer>(); 
		set = new TreeSet<Integer>();
		set.add(25);
		set.add(35);
		set.add(5);
		set.add(45);
		set.add(15);
		printSet(set);
	}
	public static void printSet(Set<Integer> set) {
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			int item = it.next();
			System.out.println("Item = "+item);
		}
	}
}
