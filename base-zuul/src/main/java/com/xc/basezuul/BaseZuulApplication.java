package com.xc.basezuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class BaseZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaseZuulApplication.class, args);
	}

}
