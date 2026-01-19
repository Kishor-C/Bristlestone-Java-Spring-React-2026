package com.bristlecone;

public class TestString {
	public static void main(String[] args) {
		String email = "ravi@gmail.com";
		System.out.println("Email = "+email);
		System.out.println("Contains '@' = "+email.contains("@"));
		int index = email.indexOf('@');
		System.out.println("Index of '@' = "+index);
		System.out.println("Length of "+email+" = "+email.length());
		int lastIndex = email.indexOf('.');
		System.out.println("Last index of '.'  = "+lastIndex);
		String domain = email.substring(index + 1, lastIndex);
		System.out.println("Domain = "+domain);
		String username = email.substring(0, index); // non-constant pool
		System.out.println("Username = "+username);
		String nickName = "ravi"; // constant pool
		System.out.println("Username = "+username+", Nick name = "+nickName);
		System.out.println("Compare == "+(username == nickName));
		System.out.println("Compare equals = "+username.equals(nickName));
		
		
		
	}
}
