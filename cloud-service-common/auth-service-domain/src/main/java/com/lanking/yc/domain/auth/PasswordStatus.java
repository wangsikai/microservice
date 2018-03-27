package com.lanking.yc.domain.auth;

import com.lanking.cloud.sdk.bean.Valueable;

/**
 * 密码状态
 * 
 * @since 3.9.7
 * @author <a href="mailto:sikai.wang@elanking.com">sikai.wang</a>
 * @version 2017年4月26日
 */
public enum PasswordStatus implements Valueable {
	/**
	 * 可用状态
	 */
	ENABLED(0),
	/**
	 * 不可用状态(无密码状态),场景：第三方登录
	 */
	DISABLED(1),
	/**
	 * 系统生成,场景：后台导入、系统重置等
	 */
	SYSTEM(2);

	private final int value;

	private PasswordStatus(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public static PasswordStatus findByValue(int value) {
		switch (value) {
		case 0:
			return ENABLED;
		case 1:
			return DISABLED;
		case 2:
			return SYSTEM;
		default:
			return null;
		}
	}
}
