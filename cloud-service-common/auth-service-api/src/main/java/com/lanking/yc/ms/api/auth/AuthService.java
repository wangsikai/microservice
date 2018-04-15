package com.lanking.yc.ms.api.auth;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lanking.yc.ms.api.auth.request.LoginRequest;
import com.lanking.yc.ms.api.auth.response.CheckTokenResponse;
import com.lanking.yc.ms.api.auth.response.LoginResponse;
import com.lanking.yc.ms.api.auth.response.LogoutResponse;
import com.lanking.yc.ms.api.auth.response.RefreshTokenResponse;

public interface AuthService {

	/**
	 * 登陆
	 * 
	 * @param request
	 *            请求对象 {@link HttpServletRequest}
	 * @param response
	 *            返回对象 {@link HttpServletResponse}
	 * @param loginRequest
	 *            请求参数 {@link LoginRequest}
	 * @return {@link LoginResponse}
	 */
	@RequestMapping(value = "/login", method = { RequestMethod.POST })
	LoginResponse login(HttpServletRequest request, HttpServletResponse response, LoginRequest loginRequest);

	/**
	 * 注销
	 * 
	 * @param request
	 *            请求对象 {@link HttpServletRequest}
	 * @param response
	 *            返回对象 {@link HttpServletResponse}
	 * @param token
	 *            token 是否返回对应session信息对象
	 * @return {@link LogoutResponse}
	 */
	@RequestMapping(value = "/logout", method = { RequestMethod.POST })
	LogoutResponse logout(HttpServletRequest request, HttpServletResponse response, String token);

	/**
	 * verify token,可以返回token对应的session信息，由initSession参数控制
	 * 
	 * @param request
	 *            请求对象 {@link HttpServletRequest}
	 * @param response
	 *            返回对象 {@link HttpServletResponse}
	 * @param token
	 *            token
	 * @param initSession
	 *            是否返回对应session信息对象
	 * @return {@link CheckTokenResponse}
	 */
	@RequestMapping(value = "/verifyToken", method = { RequestMethod.POST })
	CheckTokenResponse verifyToken(HttpServletRequest request, HttpServletResponse response, String token,
			@RequestParam(defaultValue = "false", required = false) boolean initSession);

	/**
	 * 刷新token
	 * 
	 * @param request
	 *            请求对象 {@link HttpServletRequest}
	 * @param response
	 *            返回对象 {@link HttpServletResponse}
	 * @param token
	 *            原有token
	 * @return {@link RefreshTokenResponse}
	 */
	@RequestMapping(value = "/refreshToken", method = { RequestMethod.POST })
	RefreshTokenResponse refreshToken(HttpServletRequest request, HttpServletResponse response, String token);

}
