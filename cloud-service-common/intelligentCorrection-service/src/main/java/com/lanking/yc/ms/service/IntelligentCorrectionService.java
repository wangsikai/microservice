package com.lanking.yc.ms.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableFeignClients(basePackages = { "com.lanking.yc.ms.message" })
@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.lanking.yc.ms" })
public class IntelligentCorrectionService {

	public static void main(String[] args) {
		SpringApplication.run(IntelligentCorrectionService.class, args);
	}
}
