package com.lanking.yc.domain.auth;

import com.lanking.cloud.sdk.bean.Valueable;

/**
 * 会话状态
 * 
 * @since 3.9.3
 * @author <a href="mailto:sikai.wang@elanking.com">sikai.wang</a>
 * @version 2017年3月17日
 */
public enum SessionStatus implements Valueable {
	/**
	 * 活跃
	 */
	ACTIVE(0),
	/**
	 * 不活跃
	 */
	UNACTIVE(1),
	/**
	 * 离线(被动)
	 */
	TIMEOUT(2),
	/**
	 * 离线(主动)
	 */
	LOGOUT(3);

	private int value;

	SessionStatus(int value) {
		this.value = value;
	}

	@Override
	public int getValue() {
		return this.value;
	}

	public static SessionStatus findByValue(int value) {
		switch (value) {
		case 0:
			return ACTIVE;
		case 1:
			return UNACTIVE;
		case 2:
			return TIMEOUT;
		case 3:
			return LOGOUT;
		default:
			return null;
		}
	}
}
