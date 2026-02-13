package com.example.spring_rest_demo;

import java.time.LocalDate;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// http://localhost:9090/api is the url client uses
@RestController
@RequestMapping("/api")
public class ApiController {

	@PostMapping(path = "/create")
	public ResponseEntity<Object> register(@RequestBody Profile profile) {
		return ResponseEntity.status(200).body(profile);
	}
	
	// ResponseEntity<T> T is a type of data a response body accepts
	@GetMapping(path = "/test/{id}/{name}")
	public ResponseEntity<Object> greet(@PathVariable("id") int profileId, @PathVariable("name") String username) {
		// this is a controller that must access service/business layer
		//String message = "Hello REST!";
		//Map<String, String> map = Map.of("message", message, "status", "200");
		//return ResponseEntity.status(200).body(map);
		Profile profile = new Profile(profileId, username, 9929393393L, LocalDate.parse("2019-04-26"));
		return ResponseEntity.status(200).body(profile);
	}
}
