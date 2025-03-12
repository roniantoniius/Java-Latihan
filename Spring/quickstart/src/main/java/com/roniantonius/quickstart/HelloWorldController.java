package com.roniantonius.quickstart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@GetMapping(path = "/halo")
	public String helloWorld() {
		return "Hello World Roni";
	}
}
