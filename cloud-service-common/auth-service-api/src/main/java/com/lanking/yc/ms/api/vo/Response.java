package com.lanking.yc.ms.api.vo;

import java.io.Serializable;

/**
 * 返回对象接口,TODO 需要移动到公共组件中
 */
public interface Response extends Serializable {

	public int getRet_code();

	public void setRet_code(int ret_code);

	public String getRet_msg();

	public void setRet_msg(String ret_msg);
}
