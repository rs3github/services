package org.rs3.services;

import org.springframework.stereotype.Component;

@Component
public class HelloService {

	String name;

	public HelloService() {
		// TODO Auto-generated constructor stub
	}

	public String getGreeting(String msg) {
		// TODO Auto-generated method stub
		return "From Hello Service..." + msg;
	}
}
