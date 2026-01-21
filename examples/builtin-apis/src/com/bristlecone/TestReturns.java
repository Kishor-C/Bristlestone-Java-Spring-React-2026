package com.bristlecone;

import java.sql.SQLException;

public class TestReturns {
	@SuppressWarnings("finally")
	public static String find(int n) {
		try {
			System.out.println("find() is called");
			if(n < 0) {
				throw new SQLException("n is negative");
			}
			return "try-block";
		} catch(SQLException e) {
			return "catch-block";
		} finally {
			return "finally-block";
		}
	}
	public static void main(String[] args) {
		String result = find(-1);
		System.out.println("Result = "+result);
	}
}
