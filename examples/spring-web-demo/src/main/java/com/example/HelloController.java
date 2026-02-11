package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path = "/v1") // http://ip:port/app-name/spring/v1
public class HelloController {

	// this greet() handles /spring/v1/test with HTTP GET
	// http://localhost:8080/spring-web-demo/spring/v1/test
	@RequestMapping(path = "/test", method = RequestMethod.GET)
	public String greet() {
		return "hello";
	}
}
