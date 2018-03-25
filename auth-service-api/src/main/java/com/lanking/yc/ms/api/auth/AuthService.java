package com.lanking.yc.ms.api.auth;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author Michael
 *
 */
public interface AuthService {

	@RequestMapping(value = "token")
	void token();

	@RequestMapping(value = "refresh_token")
	void refreshToken();

	@RequestMapping(value = "")
	void logout();
}
