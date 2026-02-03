package com.examples;

sealed class A permits B, C { 
	
}
non-sealed class B extends A { 
	
}
non-sealed class C extends A { 
	
}

class D extends B { 
	
}

//class D extends A { 
//	
//}


public class TestSealedClass {
	public static void main(String[] args) {
		String text = "Hello everyone\n"+
				"Hope you are fine\n"+
				"this is a big string\n";
		System.out.println(text);
		String text2 = """
				Hello everyone
				Hope all are fine
				this is another big string
				""";
		System.out.println(text2);
	}
}
