package com.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaExampleWithOrderProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaExampleWithOrderProductApplication.class, args);
	}

}
