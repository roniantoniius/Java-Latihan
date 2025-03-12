package com.roniantonius.starter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@GetMapping(path = "/halo")
	public String print() {
		return "Hello WOrld";
	}
}
