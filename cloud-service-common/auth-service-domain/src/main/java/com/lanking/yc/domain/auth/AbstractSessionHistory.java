package com.lanking.yc.domain.auth;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * 历史会话数据基类
 * 
 * @since 3.9.3
 * @author <a href="mailto:sikai.wang@elanking.com">sikai.wang</a>
 * @version 2017年3月17日
 */
@MappedSuperclass
public class AbstractSessionHistory extends AbstractSession {

	private static final long serialVersionUID = -8704757523442352713L;

	/**
	 * 在线时长
	 */
	@Column(name = "online", columnDefinition = "bigint default 0")
	private Long online;

	public Long getOnline() {
		return online;
	}

	public void setOnline(Long online) {
		this.online = online;
	}
}