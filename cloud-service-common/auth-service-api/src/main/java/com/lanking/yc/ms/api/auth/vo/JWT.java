package com.lanking.yc.ms.api.auth.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * 包含业务中用到的扩展属性
 */
@Setter
@Getter
public class JWT extends AbstractTokenProperty {
	private static final long serialVersionUID = -5905839021125642369L;

	// header中的扩展

	// payload中的扩展
	private Long accountId;
	private Long userId;

	// token所对应的Session信息(请务必阅读类功能描述)
	private Session session;
}
