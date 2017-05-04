package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableAutoConfiguration
@EnableZuulProxy
@EnableDiscoveryClient
@EnableEurekaServer
public class Springb2Application {

	public static void main(String[] args) {
		SpringApplication.run(Springb2Application.class, args);
	}
}
