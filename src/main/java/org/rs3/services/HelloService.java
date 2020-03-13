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
		return "<h1>NEW SERVICE  " + msg+" </h1><center><p style=\"color:blue;font-size:18px;\">WHAT A HELL!!!!</p></center> ";
	}
}
