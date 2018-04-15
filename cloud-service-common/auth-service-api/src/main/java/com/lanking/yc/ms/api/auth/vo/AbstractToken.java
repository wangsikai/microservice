package com.lanking.yc.ms.api.auth.vo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class AbstractToken implements Token {
	private static final long serialVersionUID = -5201740368814987114L;

	/**
	 * 原始token
	 */
	private String token;

	/**
	 * 原始token中的header
	 */
	private String header;

	/**
	 * 原始token中的payload
	 */
	private String payload;

	/**
	 * 原始token中的signature
	 */
	private String signature;

}
