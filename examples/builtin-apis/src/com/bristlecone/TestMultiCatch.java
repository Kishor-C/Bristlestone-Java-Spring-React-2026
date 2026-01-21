package com.bristlecone;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class TestMultiCatch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter some input:");
		
		try { 
			int num = scan.nextInt();
			if(num > 5) {
				throw new SQLException();
			} else {
				throw new IOException();
			}
		} catch(IOException | SQLException e) {
			System.out.println("multi-catch");
			e.printStackTrace();
		}
	}

}
