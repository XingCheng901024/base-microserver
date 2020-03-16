package com.xc.baseconsumer1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BaseConsumer1Application {

	public static void main(String[] args) {
		SpringApplication.run(BaseConsumer1Application.class, args);
	}

}
