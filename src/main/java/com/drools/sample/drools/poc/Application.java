package com.drools.sample.drools.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.drools.sample")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
