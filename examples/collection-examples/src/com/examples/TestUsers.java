package com.examples;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class TestUsers {
	public static void main(String[] args) {
		LocalDate dob1 = LocalDate.parse("1999-10-25");
		LocalDate dob2 = LocalDate.of(1999, 10, 25);
		
		LocalTime time1 = LocalTime.of(12, 35);
		
		User user1 = new User(123, "Raj", dob1);
		System.out.println("User dob: "+user1.getDob());
		
		System.out.println(dob1);
		System.out.println(dob2);
		System.out.println(time1);
	}
}
