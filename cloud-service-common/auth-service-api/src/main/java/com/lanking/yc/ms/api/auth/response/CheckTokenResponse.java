package com.lanking.yc.ms.api.auth.response;

import com.auth0.jwt.JWT;
import com.lanking.yc.ms.api.vo.AbstractResponse;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CheckTokenResponse extends AbstractResponse {

	private static final long serialVersionUID = -8691150672352981159L;

	/**
	 * check token返回结果
	 */
	private JWT jwt;

}
