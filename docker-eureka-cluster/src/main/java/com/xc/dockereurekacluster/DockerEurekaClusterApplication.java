package com.xc.dockereurekacluster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DockerEurekaClusterApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerEurekaClusterApplication.class, args);
	}

}
