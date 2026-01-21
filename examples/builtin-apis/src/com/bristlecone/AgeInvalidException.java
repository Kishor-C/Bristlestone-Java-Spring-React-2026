package com.bristlecone;

/*
 * It is a good practice to create minimum 2 constructors 
 * in custom exception class
 */
public class AgeInvalidException extends RuntimeException {
	
	public AgeInvalidException() {
		super("Age is invalid");
	}
	public AgeInvalidException(String err) {
		super(err);
	}
}
