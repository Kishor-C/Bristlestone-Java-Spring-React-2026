package com.bristlecone;

import java.io.FileNotFoundException;
import java.io.IOException;

class A {
	public void test() throws IOException {
		
	}
}
class B extends A {
	@Override
	public void test()  {
		
	}
}

public class TestOverridingRules {
	public static void main(String[] args) {
		
	}
	public static void m1(A a) {
		try {
			a.test();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
