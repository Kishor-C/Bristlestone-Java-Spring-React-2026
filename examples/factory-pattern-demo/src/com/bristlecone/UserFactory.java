package com.bristlecone;

public class UserFactory {
	/*
	 * This method creates UserService implementation object
	 * and returns UserService reference, client uses only 
	 * interface reference
	 * loosely coupled
	 * UserService service = UserFactory.getInstance();
	 * tightly coupled is 
	 * UserService service = new UserServiceArray();
	 */
	public static UserService getInstance(int size) {
		UserService service = new UserServiceArray(size);
		return service;
	}
}
