package com.lanking.yc.ms.auth.rest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lanking.yc.ms.api.auth.AuthService;
import com.lanking.yc.ms.api.auth.request.LoginRequest;
import com.lanking.yc.ms.api.auth.response.CheckTokenResponse;
import com.lanking.yc.ms.api.auth.response.LoginResponse;
import com.lanking.yc.ms.api.auth.response.LogoutResponse;
import com.lanking.yc.ms.api.auth.response.RefreshTokenResponse;

@RestController
@RequestMapping
public class AuthController implements AuthService {

	@Override
	public LoginResponse login(HttpServletRequest request, HttpServletResponse response, LoginRequest loginRequest) {
		return null;
	}

	@Override
	public LogoutResponse logout(HttpServletRequest request, HttpServletResponse response, String token) {
		return null;
	}

	@Override
	public CheckTokenResponse checkToken(HttpServletRequest request, HttpServletResponse response, String token,
			boolean initSession) {
		return null;
	}

	@Override
	public RefreshTokenResponse refreshToken(HttpServletRequest request, HttpServletResponse response, String token) {
		return null;
	}

}
