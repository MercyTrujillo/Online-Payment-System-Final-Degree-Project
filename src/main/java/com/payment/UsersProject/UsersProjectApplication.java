package com.payment.UsersProject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class UsersProjectApplication {

	private static final Logger log = LoggerFactory.getLogger(UsersProjectApplication.class);
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(UsersProjectApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "8090"));
		app.run(args);
		log.info("Users Running Correctly!!!!");
	}

}
