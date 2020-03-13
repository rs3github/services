package org.rs3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

	@Autowired
	HelloService helloService;
	
	@GetMapping("/hello")
	public String printHello(@RequestParam(value = "name", defaultValue = "Dummy!!!") String name) {
		return helloService.getGreeting("Health Checker! Hello " + name);
	}
}