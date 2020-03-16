package com.xc.baseprovider1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BaseProvider1Application {

	public static void main(String[] args) {
		SpringApplication.run(BaseProvider1Application.class, args);
	}

}
