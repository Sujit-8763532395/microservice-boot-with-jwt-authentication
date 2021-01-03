package com.dav.admission;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//DAV Admission
public class DavAdmissionApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(DavAdmissionApplication.class, args);
	}
	
}
	