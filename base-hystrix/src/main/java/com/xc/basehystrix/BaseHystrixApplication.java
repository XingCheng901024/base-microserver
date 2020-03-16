package com.xc.basehystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrixDashboard // 开启Hystrix仪表盘
public class BaseHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaseHystrixApplication.class, args);
	}

}
