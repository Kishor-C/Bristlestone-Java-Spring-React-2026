package com.bristlecone;

public class TestToString {
	public static void main(String[] args) {
		Address addr1 = new Address("KA", "BLR", 560001);
		Address addr2 = new Address("MH", "MBI", 760001);
		Employee emp1 = new Employee(101, "Ramesh", 50000.0, addr1);
		Employee emp2 = new Employee(102, "Arun", 60000.0, addr2);
		// invoking toString() is optional
		System.out.println(emp1.toString());
		System.out.println(emp2);
	}
}
