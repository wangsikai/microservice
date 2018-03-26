package com.lanking.yc.domain.auth;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 历史会话数据
 * 
 * @since 3.9.3
 * @author <a href="mailto:sikai.wang@elanking.com">sikai.wang</a>
 * @version 2017年3月17日
 */
@Entity
@Table(name = "session_history")
public class SessionHistory extends AbstractSessionHistory {

	private static final long serialVersionUID = 1093743126656725076L;

}
