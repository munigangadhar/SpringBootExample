package com.product.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;  

@SpringBootApplication
@EnableDiscoveryClient  
public class OrderManagementApplication {
	
	/**
	@Autowired
    @Lazy
    private EurekaClient eurekaClient;
    */

	public static void main(String[] args) {
		SpringApplication.run(OrderManagementApplication.class, args);
	}

}
