package com.ibm.training.wave17.mocktest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.google.gson.Gson;

@Configuration
public class AppConfig {
	
	@Bean
	public Gson gson() {
		return new Gson();
	}

}
