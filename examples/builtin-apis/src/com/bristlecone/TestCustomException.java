package com.bristlecone;

import java.util.Scanner;

public class TestCustomException {
	public static void main(String[] args) {
		/*
		 * If age is valid we will process further else throw AgeInvalidException
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter age:-");
		int age = scan.nextInt();
		try { 
			if(age < 0) {
				throw new AgeInvalidException("Age cannot be negative");
			}
			if(age < 18) {
				throw new AgeInvalidException("Age must be minimum 18");
			}
			System.out.println("Valid age to vote!");
		} catch(AgeInvalidException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("Program exited!");
	}
}
