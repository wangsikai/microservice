package com.lanking.yc.ms.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.lanking.yc.ms" })
public class MessageService {

	public static void main(String[] args) {
		SpringApplication.run(MessageService.class, args);
	}
}