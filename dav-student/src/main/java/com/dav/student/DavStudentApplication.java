package com.dav.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DavStudentApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(DavStudentApplication.class, args);
	}
	
}
	