package com.lanking.yc.domain.auth;

import com.lanking.cloud.sdk.bean.Valueable;

/**
 * 此枚举表示产品（原来登录源也用的此枚举RESCON(3)）
 * 
 * @since 3.9.3
 * @author <a href="mailto:sikai.wang@elanking.com">sikai.wang</a>
 * @version 2017年3月20日
 */
public enum Product implements Valueable {
	/**
	 * 默认、未知
	 */
	NULL(0),
	/**
	 * 悠数学
	 */
	YOOMATH(1);

	private final int value;

	private Product(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public static Product findByValue(int value) {
		switch (value) {
		case 0:
			return NULL;
		case 1:
			return YOOMATH;
		default:
			return NULL;
		}
	}
}
