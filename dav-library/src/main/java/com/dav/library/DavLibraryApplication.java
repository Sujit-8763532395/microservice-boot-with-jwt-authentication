package com.dav.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//DAV Library
public class DavLibraryApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(DavLibraryApplication.class, args);
	}
	
}
	