package com.jp.kumaawat.springdockerapp.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/welcome")
public class WelcomeController {

	@GetMapping
	public ResponseEntity<String> getWelcome(){
		return ResponseEntity.ok("Congratulations..... guys.... You are trying to reach your milestons");
	}
}
