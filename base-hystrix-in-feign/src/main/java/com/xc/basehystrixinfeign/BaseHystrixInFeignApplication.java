package com.xc.basehystrixinfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients // 启用 Feign
public class BaseHystrixInFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaseHystrixInFeignApplication.class, args);
	}

}
