package com.lanking.yc.domain.auth;

import com.lanking.cloud.sdk.bean.Titleable;
import com.lanking.cloud.sdk.bean.Valueable;
import com.lanking.cloud.sdk.util.StringUtils;

/**
 * 终端类型
 * 
 * @since 3.9.3
 * @author <a href="mailto:sikai.wang@elanking.com">sikai.wang</a>
 * @version 2017年3月17日
 */
public enum DeviceType implements Valueable, Titleable {
	/**
	 * UNKNOWN
	 */
	UNKNOWN(0, "UNKNOWN"),
	/**
	 * ANDROID
	 */
	ANDROID(1, "ANDROID"),
	/**
	 * ANDROID_PAD
	 */
	ANDROID_PAD(2, "ANDROID_PAD"),
	/**
	 * IOS
	 */
	IOS(3, "IOS"),
	/**
	 * IOS_PAD
	 */
	IOS_PAD(4, "IOS_PAD"),
	/**
	 * WP
	 */
	WP(5, "WP"),
	/**
	 * WP_PAD
	 */
	WP_PAD(6, "WP_PAD"),
	/**
	 * WEB
	 */
	WEB(7, "WEB"),
	/**
	 * PC
	 */
	PC(8, "PC"),
	/**
	 * 墨水屏
	 */
	INK_SCREEN(9, "INK_SCREEN"),
	/**
	 * ANDROID_WEBVIEW
	 */
	ANDROID_WEBVIEW(10, "ANDROID_WEBVIEW"),
	/**
	 * IOS_WEBVIEW
	 */
	IOS_WEBVIEW(11, "IOS_WEBVIEW");

	private int value;
	private String title;

	DeviceType(int value, String title) {
		this.value = value;
		this.title = title;
	}

	@Override
	public int getValue() {
		return this.value;
	}

	@Override
	public String getTitle() {
		return this.title;
	}

	public static DeviceType findByValue(int value) {
		switch (value) {
		case 0:
			return UNKNOWN;
		case 1:
			return ANDROID;
		case 2:
			return ANDROID_PAD;
		case 3:
			return IOS;
		case 4:
			return IOS_PAD;
		case 5:
			return WP;
		case 6:
			return WP_PAD;
		case 7:
			return WEB;
		case 8:
			return PC;
		case 9:
			return INK_SCREEN;
		case 10:
			return ANDROID_WEBVIEW;
		case 11:
			return IOS_WEBVIEW;
		default:
			return UNKNOWN;
		}
	}

	public static DeviceType findByTitle(String title) {
		if (StringUtils.isBlank(title)) {
			return DeviceType.WEB;
		}
		try {
			return Enum.valueOf(DeviceType.class, title);
		} catch (Exception e) {
			return DeviceType.UNKNOWN;
		}
	}
}
