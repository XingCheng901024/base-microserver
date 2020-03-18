package com.xc.basefeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients // 启用 Feign
@EnableEurekaClient
@EnableHystrix
public class BaseFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaseFeignApplication.class, args);
	}

}
