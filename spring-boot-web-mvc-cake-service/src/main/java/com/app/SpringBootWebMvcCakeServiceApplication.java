package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.*")
public class SpringBootWebMvcCakeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebMvcCakeServiceApplication.class, args);
	}

}
