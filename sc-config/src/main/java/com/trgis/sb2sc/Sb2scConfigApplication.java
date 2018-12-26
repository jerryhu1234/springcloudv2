package com.trgis.sb2sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableConfigServer
@EnableDiscoveryClient
@SpringBootApplication
public class Sb2scConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sb2scConfigApplication.class, args);
	}
}
