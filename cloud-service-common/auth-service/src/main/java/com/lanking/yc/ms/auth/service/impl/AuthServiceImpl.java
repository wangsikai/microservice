package com.lanking.yc.ms.auth.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lanking.cloud.sdk.bean.Status;
import com.lanking.cloud.sdk.util.Codecs;
import com.lanking.yc.dao.auth.AccountDAO;
import com.lanking.yc.dao.auth.UserDAO;
import com.lanking.yc.ms.api.auth.request.LoginRequest;
import com.lanking.yc.ms.auth.config.JWTProperties;
import com.lanking.yc.ms.auth.service.AuthService;
import com.lanking.yc.ms.auth.util.JWTUtils;
import com.lanking.yc.ms.auth.util.ValidateUtils;

@Service
public class AuthServiceImpl implements AuthService {

	@Autowired
	private UserDAO userDAO;

	@Autowired
	private AccountDAO accountDAO;

	@Autowired
	private JWTProperties properties;

	@Transactional(readOnly = false)
	@Override
	public String getJWT(LoginRequest loginRequest) throws Exception {
		String username = loginRequest.getUsername();
		String password = loginRequest.getPassword();
		com.lanking.yc.domain.auth.Account account = null;
		if (ValidateUtils.isEmail(username)) {
			account = accountDAO.findByEmail(username);
		} else if (ValidateUtils.isMobile(username)) {
			account = accountDAO.findByMobile(username);
		} else if (ValidateUtils.isName(username)) {
			account = accountDAO.findByUsername(username);
		}
		if (account == null || account.getStatus() == Status.DISABLED || account.getStatus() == Status.DELETED
				|| !account.getPassword().equals(Codecs.md5Hex(password.getBytes()))) {
			throw new Exception();
		}
		com.lanking.yc.domain.auth.User user = userDAO.findByAccountId(account.getId());
		if (user.getStatus() == Status.DISABLED || user.getStatus() == Status.DELETED) {
			throw new Exception();
		}
		return JWTUtils.create(account.getId(), user.getId(), properties);
	}

	@Transactional(readOnly = false)
	@Override
	public void logout(String token) {
		// 目前token不存储所以存在logout
	}

}
