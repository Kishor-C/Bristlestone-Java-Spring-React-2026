package com.bristlecone;


import java.util.Scanner;


public class TestJdbc {
	public static void main(String[] args) {
	
		// testing findById
		// assume this code is in web/mobile/console
		EmployeeDao dao = new EmployeeDao();
		Employee employee = dao.findById(1001);
		System.out.println(employee);
	}
}
