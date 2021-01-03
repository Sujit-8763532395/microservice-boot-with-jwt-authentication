package com.dav.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer		
//DAV Server
public class DavServerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(DavServerApplication.class, args);
	}
	
}
	