package com.example.spring_boot_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/*
 * Every class you create must be inside the base-package/sub-package of base package
 * to auto scan those classes
 * base package is com.example.spring_boot_demo, in case you write your class outside the 
 * base package, you must explicitly tell spring from where to scan using @ComponentScan on 
 * to of the main class
 */
@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);
		ProfileService service = (ProfileService)context.getBean("profileService");
		String result = service.greet("Raj");
		System.out.println("---- Spring boot demo: "+result+"----------");
		
	}

}
