package com.bristelcone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollectionInjection {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		PaymentServices services = (PaymentServices)ctx.getBean("b4");
		System.out.println(services.getNames());
		System.out.println(services.getPlatforms());
		
		ClassPathXmlApplicationContext ctx2 = (ClassPathXmlApplicationContext)ctx;
		ctx2.close();
	}
}
