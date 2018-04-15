package com.lanking.yc.ms.auth.service;

import com.lanking.yc.ms.api.auth.request.LoginRequest;

public interface AuthService {

	String getJWT(LoginRequest loginRequest) throws Exception;

	void logout(String token);
}
