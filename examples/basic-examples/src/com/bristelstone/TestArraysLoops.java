package com.bristelstone;

public class TestArraysLoops {
	public static void main(String[] args) {
		int[] departmentCodes = {10, 20, 30, 40};
		String[] teams = {"MI", "RCB", "KKR", "CSK"};
		char[] gender = {'M','F','m','f'};
		
		// traditional for with initialization, condition, expression
		System.out.println("--- For ----");
		for(int i = 0; i < departmentCodes.length; i++) {
			System.out.print(departmentCodes[i]+" ");
		}
		System.out.println();
		// for each / enhanced for loop
		System.out.println("---- For Each ----");
		for(int ele : departmentCodes) {
			System.out.print(ele+" ");
		}
		System.out.println();
		
		// try to use both types for loops on String[] teams & char[] gender and print them
		System.out.println("---- Teams list ---");
		for(String team : teams) {
			System.out.println(team);
		}
		System.out.println("---- Gender list ----");
		for(char g : gender) {
			System.out.println(g);
		}
	}
}
