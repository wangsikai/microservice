package com.lanking.yc.ms.handwritingProxy.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.lanking.cloud.sdk.httpClient.HttpClientFactoryBean;

@Configuration
public class HttpClientConfiguration {

	@Bean("httpClient")
	@Qualifier("httpClient")
	@Primary
	HttpClientFactoryBean httpClientFactoryBean() {
		HttpClientFactoryBean factoryBean = new HttpClientFactoryBean();
		return factoryBean;
	}

}