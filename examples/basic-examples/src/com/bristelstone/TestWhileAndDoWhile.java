package com.bristelstone;

public class TestWhileAndDoWhile {
	public static void main(String[] args) {
		int counter1 = 5;
		System.out.println("----- while ----");
		while(counter1 > 10) {
			System.out.println("while loop");
		}
		System.out.println("---- do while ----");
		do {
			System.out.println("do while loop");
		} while(counter1 > 10);
		
		String result = (counter1 > 5) ? "counter1 > 5" : "counter1 <= 5";
		
		System.out.println(result);
	}
}
