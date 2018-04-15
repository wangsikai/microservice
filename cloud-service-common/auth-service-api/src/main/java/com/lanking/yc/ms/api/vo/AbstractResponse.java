package com.lanking.yc.ms.api.vo;

import com.lanking.cloud.ex.code.StatusCode;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class AbstractResponse implements Response {

	private static final long serialVersionUID = -5493172070206822148L;

	public int ret_code = StatusCode.SUCCEED;

	public String ret_msg = "OK";
}
