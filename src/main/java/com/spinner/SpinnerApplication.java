package com.spinner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.models","com.repo","com.controller"})
public class SpinnerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpinnerApplication.class, args);
	}

}
