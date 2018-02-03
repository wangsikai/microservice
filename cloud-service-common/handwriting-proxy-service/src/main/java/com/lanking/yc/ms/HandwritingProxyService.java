package com.lanking.yc.ms;

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
@ComponentScan(basePackages = { "com" })
public class HandwritingProxyService {

	public static void main(String[] args) {
		SpringApplication.run(HandwritingProxyService.class, args);
	}
}
