package com.bristelcone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSetterConstructorInjection {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		DatabaseProperties devProperties = (DatabaseProperties)ctx.getBean("b2");
		
		System.out.println("Username = "+devProperties.getUsername());
		
		DatabaseProperties testProperties = (DatabaseProperties)ctx.getBean("b3");
		System.out.println("Username = "+testProperties.getUsername());
	}
}
