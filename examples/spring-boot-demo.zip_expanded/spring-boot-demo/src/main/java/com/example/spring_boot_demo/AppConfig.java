package com.example.spring_boot_demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*
 * Create this object in the spring container
 */
@Component
public class AppConfig {
	
	@Value("${spring.application.name}")
	private String title;
	
	@Value("${server.port}")
	private int port;

	public String getTitle() {
		return title;
	}

	public int getPort() {
		return port;
	}
	
}
