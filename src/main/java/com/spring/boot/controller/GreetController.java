package com.spring.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

	@GetMapping(path="/hello")
	public String sayHello(){
		return "Hello Shashidhar.... Welcome to Springboot World.";
	}
}
