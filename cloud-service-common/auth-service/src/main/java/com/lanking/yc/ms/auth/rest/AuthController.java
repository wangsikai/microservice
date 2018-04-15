package com.lanking.yc.ms.auth.rest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lanking.yc.ms.api.auth.AuthService;
import com.lanking.yc.ms.api.auth.request.LoginRequest;
import com.lanking.yc.ms.api.auth.response.CheckTokenResponse;
import com.lanking.yc.ms.api.auth.response.LoginResponse;
import com.lanking.yc.ms.api.auth.response.LogoutResponse;
import com.lanking.yc.ms.api.auth.response.RefreshTokenResponse;
import com.lanking.yc.ms.api.auth.vo.JWT;
import com.lanking.yc.ms.api.auth.vo.Session;
import com.lanking.yc.ms.auth.config.JWTProperties;
import com.lanking.yc.ms.auth.util.JWTUtils;

@RestController
@RequestMapping
public class AuthController implements AuthService {

	@Autowired
	private com.lanking.yc.ms.auth.service.AuthService authService;
	@Autowired
	private JWTProperties properties;

	@Override
	public LoginResponse login(HttpServletRequest request, HttpServletResponse response, LoginRequest loginRequest) {
		LoginResponse loginResponse = new LoginResponse();
		try {
			loginResponse.setToken(authService.getJWT(loginRequest));
		} catch (Exception e) {
			loginResponse.setRet_code(LoginResponse.FAIL_CODE);
			loginResponse.setRet_msg(LoginResponse.FAIL_MESSAGE);
		}
		return loginResponse;
	}

	@Override
	public LogoutResponse logout(HttpServletRequest request, HttpServletResponse response, String token) {
		LogoutResponse logoutResponse = new LogoutResponse();
		try {
			authService.logout(token);
		} catch (Exception e) {
			logoutResponse.setRet_code(LoginResponse.FAIL_CODE);
			logoutResponse.setRet_msg(LoginResponse.FAIL_MESSAGE);
		}
		return logoutResponse;
	}

	@Override
	public CheckTokenResponse verifyToken(HttpServletRequest request, HttpServletResponse response, String token,
			boolean initSession) {
		CheckTokenResponse checkTokenResponse = new CheckTokenResponse();
		try {
			JWTUtils.verify(token, properties);
			JWT jwt = JWTUtils.decode(token);
			if (initSession) {
				jwt.setSession(new Session());
			}
			checkTokenResponse.setJwt(jwt);
		} catch (Exception e) {
			checkTokenResponse.setRet_code(LoginResponse.FAIL_CODE);
			checkTokenResponse.setRet_msg(LoginResponse.FAIL_MESSAGE);
		}
		return checkTokenResponse;
	}

	@Override
	public RefreshTokenResponse refreshToken(HttpServletRequest request, HttpServletResponse response, String token) {
		RefreshTokenResponse refreshTokenResponse = new RefreshTokenResponse();
		try {
			JWTUtils.verify(token, properties);
			refreshTokenResponse.setToken(JWTUtils.refresh(token, properties));
		} catch (Exception e) {
			refreshTokenResponse.setRet_code(LoginResponse.FAIL_CODE);
			refreshTokenResponse.setRet_msg(LoginResponse.FAIL_MESSAGE);
		}
		return refreshTokenResponse;
	}

}
