package com.dav.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//DAV Portal
public class DavPortalApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(DavPortalApplication.class, args);
	}
	
}
	