package com.lanking.yc.domain.auth;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.lanking.cloud.sdk.bean.Status;
import com.lanking.cloud.sdk.bean.Userable;

import lombok.Getter;
import lombok.Setter;

/**
 * 用户
 * 
 * @since 3.9.3
 * @author <a href="mailto:sikai.wang@elanking.com">sikai.wang</a>
 * @version 2017年3月21日
 */
@Setter
@Getter
@Entity
@Table(name = "user")
public class User implements Userable, Serializable {

	private static final long serialVersionUID = -5821996501274854322L;

	@Id
	private Long id;

	/**
	 * 对应账户ID
	 */
	@Column(name = "account_id")
	private Long accountId;

	/**
	 * 用户类型
	 */
	@Column(name = "user_type", precision = 3)
	private UserType userType;

	/**
	 * 用户名
	 */
	@Column(name = "name", length = 40)
	private String name;

	/**
	 * 昵称
	 */
	@Column(name = "nickname", length = 40)
	private String nickname;

	/**
	 * 用户状态,对应account中的status
	 */
	@Column(name = "status", precision = 3)
	private Status status;

	/**
	 * 是否是导入用户
	 */
	@Column(name = "import0", columnDefinition = "bit default 0")
	private boolean import0;

	/**
	 * 用户所属渠道
	 */
	@Column(name = "user_channel_code", precision = 5)
	private Integer userChannelCode;

}
