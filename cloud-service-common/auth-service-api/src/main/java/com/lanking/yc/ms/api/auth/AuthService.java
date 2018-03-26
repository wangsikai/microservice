package com.lanking.yc.ms.api.auth;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author Michael
 *
 */
public interface AuthService {

	/**
	 * 获取token
	 */
	@RequestMapping(value = "token")
	void token();

	@RequestMapping(value = "logout")
	void logout();
}
