package com.lanking.yc.ms.handwritingProxy.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ConfigurationProperties(prefix = "ms.handwriting-proxy")
@Configuration
public class HwProxyProperties {

	private String proxy;

}
