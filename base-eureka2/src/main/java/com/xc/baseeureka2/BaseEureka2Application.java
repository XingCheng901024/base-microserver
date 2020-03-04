package com.xc.baseeureka2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BaseEureka2Application {

	public static void main(String[] args) {
		SpringApplication.run(BaseEureka2Application.class, args);
	}

}
