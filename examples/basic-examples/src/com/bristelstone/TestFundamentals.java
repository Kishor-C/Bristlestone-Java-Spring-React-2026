package com.bristelstone;

public class TestFundamentals {
	public static void main(String[] args) {
		// Datatypes - primitives / non-primitives
		// String is a non-primitive datatypes
		String username = "Alexandar";
		int age = 25;
		long phone = 9947483648L;
		String email = "alex@gmail.com";
		char gender = 'M';
		double height = 5.8;
		boolean isEmployed = true;
		System.out.println("Username = "+username);
		System.out.println("Age = "+age+", Phone = "+phone+", Email = "+email);
		System.out.println("Gender = "+gender+", Height = "+height+", Employed = "+isEmployed);
		// if and else
		if(gender == 'M') {
			System.out.println("Hello Mr. "+username);
		} else if(gender == 'F') {
			System.out.println("Hello Ms. "+username);
		} else {
			System.out.println("Hello "+username);
		}
	}
}
