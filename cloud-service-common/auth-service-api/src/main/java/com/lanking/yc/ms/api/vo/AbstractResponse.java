package com.lanking.yc.ms.api.vo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class AbstractResponse implements Response {

	private static final long serialVersionUID = -5493172070206822148L;

	public static int SUCCESS_CODE = 0;
	public static int FAIL_CODE = -1;

	public static String SUCCESS_MESSAGE = "OK";
	public static String FAIL_MESSAGE = "fail";

	public int ret_code = SUCCESS_CODE;
	public String ret_msg = SUCCESS_MESSAGE;

}
