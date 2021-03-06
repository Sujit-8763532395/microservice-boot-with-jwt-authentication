package com.dav.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient 	
@EnableZuulProxy
//DAV Gateway
public class DavGatewayApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(DavGatewayApplication.class, args);
	}
	
}
	