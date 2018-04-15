package com.lanking.yc.ms.auth.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ConfigurationProperties(prefix = "ms.auth.jwt")
@Configuration
public class JWTProperties {
	private String secret;

	private String issuer;

	private String subject;

	/**
	 * token支持的最大发呆时间(ms)
	 */
	private long inactiveInterval;
	/**
	 * token支持的有效时间(ms)
	 */
	private long expires;

}
