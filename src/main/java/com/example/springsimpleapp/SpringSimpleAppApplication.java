package com.example.springsimpleapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSimpleAppApplication {

	public static void main(String[] args) {
		System.out.println("Hello World");
		SpringApplication.run(SpringSimpleAppApplication.class, args);
	}

}
