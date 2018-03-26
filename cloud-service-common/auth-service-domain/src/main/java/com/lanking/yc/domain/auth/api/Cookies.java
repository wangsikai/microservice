package com.lanking.yc.domain.auth.api;

/**
 * 放在cookie中的数据KEY
 * 
 * @since 3.9.3
 * @author <a href="mailto:sikai.wang@elanking.com">sikai.wang</a>
 * @version 2017年3月17日
 */
public final class Cookies {
	/**
	 * token
	 */
	public static final String SECURITY_TOKEN = "S_T";
	/**
	 * 登录状态(1-登录0-游客)
	 */
	public static final String SECURITY_LOGIN_STATUS = "S_L_S";
	/**
	 * 当前用户名
	 */
	public static final String REMEMBER_USERNAME = "S_T_U";
	/**
	 * 用户类型
	 */
	public static final String REMEMBER_USERTYPE = "S_T_UT";
	/**
	 * 是否需要验证码
	 */
	public static final String LOGIN_NEET_VERIFYCODE = "L_N_V";
	/**
	 * 登录错误的次数
	 */
	public static final String LOGIN_WRONG_TIME = "L_W_T";

	private Cookies() {
	}
}
