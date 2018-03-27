package com.lanking.yc.domain.auth;

import com.lanking.cloud.sdk.bean.Valueable;

/**
 * 用户类型
 * 
 * @since 3.9.3
 * @author <a href="mailto:sikai.wang@elanking.com">sikai.wang</a>
 * @version 2017年3月21日
 */
public enum UserType implements Valueable {
	NULL(0),
	/**
	 * 教师
	 */
	TEACHER(1),
	/**
	 * 学生
	 */
	STUDENT(2),
	/**
	 * 家长
	 */
	PARENT(3),
	/**
	 * 管理员
	 */
	ADMIN(4),
	/**
	 * 供应商管理员
	 */
	VENDOR_ADMIN(5),
	/**
	 * 供应商负责人
	 */
	VENDOR_HEAD(6),
	/**
	 * 供应商录入员
	 */
	VENDOR_BUILD(7),
	/**
	 * 供应商校验员
	 */
	VENDOR_CHECK(8),
	/**
	 * 校谷学校管理员
	 */
	VALLEY_ADMIN(9);

	private int value;

	UserType(int value) {
		this.value = value;
	}

	@Override
	public int getValue() {
		return this.value;
	}

	public String getCnName() {
		if (this == TEACHER) {
			return "老师";
		} else if (this == STUDENT) {
			return "学生";
		} else if (this == PARENT) {
			return "家长";
		} else if (this == ADMIN) {
			return "管理员";
		} else if (this == VENDOR_ADMIN) {
			return "管理员";
		} else if (this == VENDOR_HEAD) {
			return "负责人";
		} else if (this == VENDOR_BUILD) {
			return "录入员";
		} else if (this == VENDOR_CHECK) {
			return "校验员";
		} else if (this == VALLEY_ADMIN) {
			return "管理员";
		} else {
			return "";
		}
	}

	public static UserType findByValue(int value) {
		switch (value) {
		case 0:
			return NULL;
		case 1:
			return TEACHER;
		case 2:
			return STUDENT;
		case 3:
			return PARENT;
		case 4:
			return ADMIN;
		case 5:
			return VENDOR_ADMIN;
		case 6:
			return VENDOR_HEAD;
		case 7:
			return VENDOR_BUILD;
		case 8:
			return VENDOR_CHECK;
		case 9:
			return VALLEY_ADMIN;
		default:
			return NULL;
		}
	}

}
