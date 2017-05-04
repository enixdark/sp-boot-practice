package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("classic.xml");
		SpringApplication.run(DemoApplication.class, args);
	}

	public void setConfigurationProjectName(String pn) {
		System.out.println("the configuration project name is " + pn);
	}
}
