package com.bristlecone;

public class TestStringBuffer {
	public static void main(String[] args) {
		// toString() is overridden in StringBuffer and StringBuilder to return content
		StringBuffer buffer1 = new StringBuffer("Java");
		StringBuffer buffer2 = new StringBuffer("Java");
		System.out.println("buffer1 = "+buffer1+", buffer2 = "+buffer2);
		System.out.println("buffer1 equals buffer2 = "+buffer1.equals(buffer2));
		buffer1.append(" is easy");
		System.out.println("buffer1 = "+buffer1);
		buffer2.reverse();
		System.out.println("buffer2 = "+buffer2);
		buffer2.insert(2, "TEST");
		System.out.println("buffer2 = "+buffer2);
	}
}
