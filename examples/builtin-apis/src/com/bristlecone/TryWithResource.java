package com.bristlecone;

import java.util.Scanner;

public class TryWithResource {
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in);) {
			System.out.println("Enter num: ");
			int n = sc.nextInt();
			System.out.println("N = "+n);
		}
		
		
	}
}
