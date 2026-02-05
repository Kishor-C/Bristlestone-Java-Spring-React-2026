package com.bristelcone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoc {

	public static void main(String[] args) {
		// this code will be present in multiple places
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Greet greet = (Greet)ctx.getBean("b1");
		greet.print();
	}

}
