package com.microservice.product.importadora;

import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableEurekaClient
@EnableJpaRepositories
@EnableTransactionManagement
@SpringBootApplication
public class MicroserviceProductApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(MicroserviceProductApplication.class, args);
		PropertyConfigurator
				.configure(MicroserviceProductApplication.class.getClassLoader().getResource("log4j.properties"));
	}

}
