package com.bristelstone;

import java.util.Scanner;

public class TestSwitch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		// nextInt(), next(), nextDouble(), nextFloat()
		System.out.println("Enter an option:");
		System.out.println("1: Capacino 2: Espresso 3: Hot water 4: Milk");
		int option = scan.nextInt();
		System.out.println("Enter your name");
		scan.nextLine();
		String name = scan.nextLine();
		System.out.println("Hi "+name);
		switch(option) {
		case 1: System.out.println("Capacino is selcted");
		break;
		case 2: System.out.println("Espresso is selcted");
		break;
		case 3: System.out.println("Hot water is selcted");
		break;
		case 4: System.out.println("Milk is selcted");
		break;
		default : 
			System.out.println("Nothing selected");
		}
		
		scan.close();
	}
}
