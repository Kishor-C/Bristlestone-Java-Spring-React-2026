package com.example.spring_boot_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 * This creates object in spring container
 * @Service is used on top of the class that has business logics
 */
// id will be profileService
@Service
public class ProfileService {
	
	@Autowired
	private AppConfig config;
	
	public ProfileService() {
		System.out.println("ProfileService constructor() called");
	}
	
	public String greet(String name) {
		return "Welcome: "+name+", title: "+config.getTitle()+", port: "+config.getPort();
	}
}
