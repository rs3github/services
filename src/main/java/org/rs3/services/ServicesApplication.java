package org.rs3.services;

import java.io.PrintStream;
import java.util.Collections;

import org.springframework.boot.Banner;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class ServicesApplication {

	public static void main(String[] args) {
		SpringApplication springApp = new SpringApplication(ServicesApplication.class);
		springApp.setBannerMode(Mode.CONSOLE);
		springApp.setBanner(new Banner() {

			@Override
			public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
				out.print("Welcome Shiv's SPRING BOOT...\n\n");

			}
		});
		springApp.setWebApplicationType(WebApplicationType.SERVLET);
		springApp.setDefaultProperties(Collections.singletonMap("server.port", "8083"));
		springApp.run(args);
	}
}