package com.First.Api.demoRestApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("/demo-Rest-Api/src/main/java")
public class DemoRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoRestApiApplication.class, args);
	}

}
