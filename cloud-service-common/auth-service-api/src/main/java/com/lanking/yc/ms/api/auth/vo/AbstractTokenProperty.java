package com.lanking.yc.ms.api.auth.vo;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.auth0.jwt.interfaces.Claim;

import lombok.Getter;
import lombok.Setter;

/**
 * 抽象token(JWT标准属性)
 */
@Setter
@Getter
public abstract class AbstractTokenProperty extends AbstractToken {
	private static final long serialVersionUID = -1060585848402930766L;

	// header(不包含所有)
	@Deprecated
	private String keyId;
	@Deprecated
	private String contentType;
	private String type;
	private String algorithm;

	// payload
	@Deprecated
	private String id;
	@Deprecated
	private String issuer;
	@Deprecated
	private String subject;
	private Date issuedAt;
	private Date expiresAt;
	@Deprecated
	private Date notBefore;
	@Deprecated
	private List<String> audience;
	@Deprecated
	private Map<String, Claim> claims;

}
