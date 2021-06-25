package com.springdatajpa.boot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import com.springdatajpa.boot.storage.StorageProperties;
import com.springdatajpa.boot.storage.StorageService;

//Class for starting Spring Boot Application
@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class WebApplication extends SpringBootServletInitializer {
	//Entry point for application starting
    public static void main(String[] args) throws Exception {
        SpringApplication.run(WebApplication.class, args);
    }
    //Part of Spring security implementation
    @Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(WebApplication.class);
	}
    
    //Bean for File Uploading feature implementation
    @Bean
	CommandLineRunner init(StorageService storageService) {
		return (args) -> {
			storageService.deleteAll();
			storageService.init();
		};
	}
 
}
