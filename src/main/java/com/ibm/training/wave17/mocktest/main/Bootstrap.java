package com.ibm.training.wave17.mocktest.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ibm.training.wave17.mocktest")
public class Bootstrap {
	
	public static void main(String args[]) {
		SpringApplication.run(Bootstrap.class, args);
	}

}
