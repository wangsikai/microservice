package com.lanking.yc.ms.api.auth.request;

import com.lanking.yc.ms.api.vo.AbstractRequest;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LoginRequest extends AbstractRequest {

	private static final long serialVersionUID = 8506421033209802724L;

	/**
	 * 用户名
	 */
	private String username;
	/**
	 * 密码
	 */
	private String password;
}
