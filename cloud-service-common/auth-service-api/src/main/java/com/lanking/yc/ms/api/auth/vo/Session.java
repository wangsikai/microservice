package com.lanking.yc.ms.api.auth.vo;

import java.io.Serializable;

/**
 * token所对应的会话信息
 * 
 * <pre>
 * 相关信息可能不会存储中token中，但是通过token可以获取到此信息；
 * 此对象是为了兼容com.lanking.uxb.service.session.api.Session接口，请相关开发人员进行扩展的生活注意
 * </pre>
 */
public final class Session implements Serializable {
	private static final long serialVersionUID = -2452618351800573977L;

	// 相关开发人员可以根据需要进行扩展
}
