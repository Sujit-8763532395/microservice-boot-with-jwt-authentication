package com.dav.faculty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//DAV Faculty
public class DavFacultyApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(DavFacultyApplication.class, args);
	}
	
}
	