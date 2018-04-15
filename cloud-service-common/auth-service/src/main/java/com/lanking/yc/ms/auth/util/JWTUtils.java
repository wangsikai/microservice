package com.lanking.yc.ms.auth.util;

import java.io.UnsupportedEncodingException;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

/**
 * 此类提供针对当前业务逻辑下的JWT相关操作工具
 */
public final class JWTUtils {

	public static void main(String[] args) throws IllegalArgumentException, UnsupportedEncodingException {
		Algorithm algorithm = Algorithm.HMAC256("qnR8UCqJggD55PohusaBNviGoOJ67HC6Btry4qXLVZc");
		String token = JWT.create().withIssuer("auth0").withClaim("userId", "mac").sign(algorithm);
		System.err.println(token);

		JWTVerifier verifier = JWT.require(algorithm).withIssuer("auth0").build(); // Reusable verifier instance
		// DecodedJWT jwt = verifier.verify(token);
		DecodedJWT jwt = JWT.decode(token);
		System.err.println(jwt.getType());
		System.err.println(jwt.getAlgorithm());
		System.err.println(jwt.getPayload());
		System.err.println(jwt.getClaim("userId").asString());
		System.err.println(jwt.getPayload());
	}
}
