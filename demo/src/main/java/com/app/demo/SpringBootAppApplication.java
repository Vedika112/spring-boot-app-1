package com.app.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class SpringBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppApplication.class, args);
	}

}
