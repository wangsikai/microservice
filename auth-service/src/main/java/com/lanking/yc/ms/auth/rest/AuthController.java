package com.lanking.yc.ms.auth.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lanking.yc.ms.api.auth.AuthService;

@RestController
@RequestMapping
public class AuthController implements AuthService {

	@Override
	public void token() {
	}

	@Override
	public void refreshToken() {

	}

	@Override
	public void logout() {

	}

}
