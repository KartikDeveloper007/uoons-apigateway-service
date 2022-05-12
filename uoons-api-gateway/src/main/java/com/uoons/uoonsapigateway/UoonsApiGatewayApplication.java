package com.uoons.uoonsapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UoonsApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(UoonsApiGatewayApplication.class, args);
	}

}
