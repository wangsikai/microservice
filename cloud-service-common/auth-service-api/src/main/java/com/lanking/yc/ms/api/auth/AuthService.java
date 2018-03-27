package com.lanking.yc.ms.api.auth;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface AuthService {

	@RequestMapping(value = "login", method = { RequestMethod.POST })
	String login(HttpServletRequest request, HttpServletResponse response, String username, String password);

	@RequestMapping(value = "logout", method = { RequestMethod.POST })
	void logout(HttpServletRequest request, HttpServletResponse response);

}
