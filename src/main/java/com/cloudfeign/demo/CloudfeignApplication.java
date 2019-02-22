package com.cloudfeign.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients

@EnableHystrixDashboard
@EnableCircuitBreaker
public class CloudfeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudfeignApplication.class, args);
	}

}

