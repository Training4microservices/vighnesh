package com.spring.security.springsecuritydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpringsecurityDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringsecurityDemoApplication.class, args);
	}

}
