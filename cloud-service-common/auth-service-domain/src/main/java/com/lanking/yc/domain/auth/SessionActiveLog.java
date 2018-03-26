package com.lanking.yc.domain.auth;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.lanking.cloud.component.db.support.hibernate.identifierGenerator.SnowflakeGenerator;

/**
 * 会话活跃数据
 * 
 * @since 3.9.3
 * @author <a href="mailto:sikai.wang@elanking.com">sikai.wang</a>
 * @version 2017年3月17日
 */
@Entity
@Table(name = "session_active_log")
public class SessionActiveLog implements Serializable {

	private static final long serialVersionUID = -4537019523896491702L;

	@Id
	@GeneratedValue(generator = "snowflake")
	@GenericGenerator(name = "snowflake", strategy = SnowflakeGenerator.TYPE)
	private Long id;

	/**
	 * token
	 */
	@Column(length = 32, name = "token")
	private String token;

	/**
	 * 关联用户ID
	 */
	@Column(name = "user_id")
	private long userId;

	/**
	 * 设备类型
	 * 
	 * @see DeviceType
	 */
	@Column(name = "device_type", precision = 3)
	private DeviceType deviceType;

	/**
	 * 开始活跃时间
	 */
	@Column(name = "start_active_at")
	private long startActiveAt;

	/**
	 * 终止活跃时间
	 */
	@Column(name = "end_active_at")
	private long endActiveAt;

	/**
	 * 活跃时长
	 */
	@Column(name = "active_time")
	private long activeTime;

	/**
	 * 创建时间
	 */
	@Column(name = "create_at")
	private long createAt;

	public Long getId() {
		return id;
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

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public DeviceType getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(DeviceType deviceType) {
		this.deviceType = deviceType;
	}

	public long getStartActiveAt() {
		return startActiveAt;
	}

	public void setStartActiveAt(long startActiveAt) {
		this.startActiveAt = startActiveAt;
	}

	public long getEndActiveAt() {
		return endActiveAt;
	}

	public void setEndActiveAt(long endActiveAt) {
		this.endActiveAt = endActiveAt;
	}

	public long getActiveTime() {
		return activeTime;
	}

	public void setActiveTime(long activeTime) {
		this.activeTime = activeTime;
	}

	public long getCreateAt() {
		return createAt;
	}

	public void setCreateAt(long createAt) {
		this.createAt = createAt;
	}

}
