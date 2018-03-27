package com.lanking.yc.ms.auth.rest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lanking.yc.ms.api.auth.AuthService;

@RestController
@RequestMapping
public class AuthController implements AuthService {

	@Override
	public String login(HttpServletRequest request, HttpServletResponse response, String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void logout(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

	}

}
