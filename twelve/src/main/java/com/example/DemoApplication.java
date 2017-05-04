package com.example;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;

@Configuration
@PropertySource("config.properties")
@SpringBootApplication
public class DemoApplication {

	@Bean
	static PropertySourcesPlaceholderConfigurer pspc() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	@Value("${configuration.projectName}")
	private String configurationProjectNameField;

	@Value("${configuration.projectName}")
	void setProjectName(String projectName) {
		System.out.println("setProjectName: " + projectName);
	}

	@Autowired
	void setEnvironment(Environment env){
		System.out.println("setEnvironment: " + env.getProperty("configuration.projectName"));
	}

	@PostConstruct
	void afterPropertiesSet() {
		System.out.println("configurationProjectNameField: " +
		this.configurationProjectNameField);
	}

	@Bean
	InitializingBean both(Environment env,
						  @Value("${configuration.projectName") String projectName){

		return () -> {
			System.out.println("@Bean with both dependencies (env): "
			+ projectName);
			System.out.println("@Bean with both dependencies (env): "
					+ env.getProperty("configuration.projectName"));
		};
	}

	public static void main(String[] args) {
//		new ClassPathXmlApplicationContext("classic.xml");
		SpringApplication.run(DemoApplication.class, args);
	}

//	public void setConfigurationProjectName(String pn) {
//		System.out.println("the configuration project name is " + pn);
//	}
}


