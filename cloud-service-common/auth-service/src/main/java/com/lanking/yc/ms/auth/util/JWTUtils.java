package com.lanking.yc.ms.auth.util;

import java.io.UnsupportedEncodingException;
import java.util.Date;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.lanking.yc.ms.auth.config.JWTProperties;
import com.lanking.yc.ms.auth.constant.AuthServiceConstant;

/**
 * 此类提供针对当前业务逻辑下的JWT相关操作工具
 */
public final class JWTUtils {

	public static String create(Long accountId, Long userId, JWTProperties properties)
			throws IllegalArgumentException, UnsupportedEncodingException {
		Date now = new Date();
		Algorithm algorithm = Algorithm.HMAC256(properties.getSecret());
		return JWT.create().withIssuer(properties.getIssuer()).withSubject(properties.getSubject()).withIssuedAt(now)
				.withExpiresAt(new Date(now.getTime() + properties.getExpires()))
				.withClaim(AuthServiceConstant.CLAIM_ACCOUNT_ID, accountId)
				.withClaim(AuthServiceConstant.CLAIM_USER_ID, userId).sign(algorithm);
	}

	public static String refresh(String token, JWTProperties properties)
			throws IllegalArgumentException, UnsupportedEncodingException {
		com.lanking.yc.ms.api.auth.vo.JWT jwt = decode(token);
		Algorithm algorithm = Algorithm.HMAC256(properties.getSecret());
		return JWT.create().withIssuer(properties.getIssuer()).withSubject(properties.getSubject())
				.withIssuedAt(jwt.getIssuedAt())
				.withExpiresAt(new Date(System.currentTimeMillis() + properties.getExpires()))
				.withClaim(AuthServiceConstant.CLAIM_ACCOUNT_ID, jwt.getAccountId())
				.withClaim(AuthServiceConstant.CLAIM_USER_ID, jwt.getUserId()).sign(algorithm);
	}

	public static com.lanking.yc.ms.api.auth.vo.JWT decode(String token) {
		com.lanking.yc.ms.api.auth.vo.JWT jwt = new com.lanking.yc.ms.api.auth.vo.JWT();
		DecodedJWT decodedJWT = JWT.decode(token);
		jwt.setToken(token);
		jwt.setHeader(decodedJWT.getHeader());
		jwt.setPayload(decodedJWT.getPayload());
		jwt.setSignature(decodedJWT.getSignature());

		jwt.setType(decodedJWT.getType());
		jwt.setAlgorithm(decodedJWT.getAlgorithm());

		jwt.setIssuedAt(decodedJWT.getIssuedAt());
		jwt.setExpiresAt(decodedJWT.getExpiresAt());

		jwt.setAccountId(decodedJWT.getClaim(AuthServiceConstant.CLAIM_ACCOUNT_ID).asLong());
		jwt.setAccountId(decodedJWT.getClaim(AuthServiceConstant.CLAIM_USER_ID).asLong());
		return jwt;
	}

	public static void verify(String token, JWTProperties properties)
			throws JWTVerificationException, IllegalArgumentException, UnsupportedEncodingException {
		Algorithm algorithm = Algorithm.HMAC256(properties.getSecret());
		JWTVerifier verifier = JWT.require(algorithm).withIssuer(properties.getIssuer())
				.withSubject(properties.getSubject()).build();
		verifier.verify(token);
	}

}
