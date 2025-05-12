package com.sameer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExampleProjectApplication {
	int x=100;
	int y=200;
	boolean b=true;
	
	public static void main(String[] args) {
		SpringApplication.run(ExampleProjectApplication.class, args);
	}

}
