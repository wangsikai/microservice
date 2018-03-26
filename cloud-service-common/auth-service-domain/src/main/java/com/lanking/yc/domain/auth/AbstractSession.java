package com.lanking.yc.domain.auth;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.usertype.UserType;

import com.lanking.cloud.component.db.support.hibernate.identifierGenerator.SnowflakeGenerator;

/**
 * 会话数据基类
 * 
 * @since 3.9.3
 * @author <a href="mailto:sikai.wang@elanking.com">sikai.wang</a>
 * @version 2017年3月17日
 */
@MappedSuperclass
public class AbstractSession implements Serializable {

	private static final long serialVersionUID = -9069694176440496226L;

	@Id
	@GeneratedValue(generator = "snowflake")
	@GenericGenerator(name = "snowflake", strategy = SnowflakeGenerator.TYPE)
	private Long id;

	/**
	 * 会话token
	 */
	@Column(length = 32, name = "token", nullable = false, unique = true)
	private String token;

	/**
	 * 关联账号ID
	 */
	@Column(name = "account_id", columnDefinition = "bigint default 1")
	private long accountId;

	/**
	 * 关联用户ID
	 */
	@Column(name = "user_id", nullable = false)
	private long userId;

	/**
	 * 关联设备数据记录ID
	 */
	@Column(name = "device_id")
	private Long deviceId;

	/**
	 * IP
	 */
	@Column(length = 64)
	private String ip;

	/**
	 * agent
	 */
	@Column(length = 1024)
	private String agent;

	/**
	 * 创建时间
	 */
	@Column(name = "create_at", nullable = false)
	private long createAt;

	/**
	 * 最后一次活跃时间点
	 */
	@Column(name = "active_at", nullable = false)
	private long activeAt;

	/**
	 * 登录时间
	 */
	@Column(name = "login_at", nullable = false)
	private long loginAt;

	/**
	 * 结束时间
	 */
	@Column(name = "end_at", nullable = false)
	private long endAt;

	/**
	 * 会话状态
	 * 
	 * @see SessionStatus
	 */
	@Column(precision = 3, nullable = false)
	private SessionStatus status;

	/**
	 * 用户类型
	 * 
	 * @see UserType
	 */
	@Column(name = "user_type", precision = 3, nullable = false)
	private UserType userType;

	/**
	 * 登录源
	 * 
	 * @see Product
	 */
	@Column(name = "login_source", precision = 3)
	private Product loginSource;

	/**
	 * 终端类型
	 * 
	 * @see DeviceType
	 */
	@Column(name = "device_type", precision = 3, columnDefinition = "tinyint default 7")
	private DeviceType deviceType = DeviceType.WEB;

	/**
	 * 在线有效活跃时间(和session.web.unactive、session.mobile.unactive有关系)
	 */
	@Column(name = "active_time", columnDefinition = "bigint default 0")
	private long activeTime;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public Long getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(Long deviceId) {
		this.deviceId = deviceId;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getAgent() {
		return agent;
	}

	public void setAgent(String agent) {
		this.agent = agent;
	}

	public long getCreateAt() {
		return createAt;
	}

	public void setCreateAt(long createAt) {
		this.createAt = createAt;
	}

	public long getActiveAt() {
		return activeAt;
	}

	public void setActiveAt(long activeAt) {
		this.activeAt = activeAt;
	}

	public long getLoginAt() {
		return loginAt;
	}

	public void setLoginAt(long loginAt) {
		this.loginAt = loginAt;
	}

	public long getEndAt() {
		return endAt;
	}

	public void setEndAt(long endAt) {
		this.endAt = endAt;
	}

	public SessionStatus getStatus() {
		return status;
	}

	public void setStatus(SessionStatus status) {
		this.status = status;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public Product getLoginSource() {
		return loginSource;
	}

	public void setLoginSource(Product loginSource) {
		this.loginSource = loginSource;
	}

	public DeviceType getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(DeviceType deviceType) {
		this.deviceType = deviceType;
	}

	public long getActiveTime() {
		return activeTime;
	}

	public void setActiveTime(long activeTime) {
		this.activeTime = activeTime;
	}

}
