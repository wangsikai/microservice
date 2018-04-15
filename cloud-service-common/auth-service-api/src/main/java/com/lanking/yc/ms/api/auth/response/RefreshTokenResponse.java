package com.lanking.yc.ms.api.auth.response;

import com.lanking.yc.ms.api.vo.AbstractResponse;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RefreshTokenResponse extends AbstractResponse {

	private static final long serialVersionUID = -8691150672352981159L;

	/**
	 * 刷新获取到的新token
	 */
	private String token;

}
