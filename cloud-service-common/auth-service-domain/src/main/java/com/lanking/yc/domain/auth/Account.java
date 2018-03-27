package com.lanking.yc.domain.auth;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.lanking.cloud.component.db.support.hibernate.identifierGenerator.SnowflakeGenerator;
import com.lanking.cloud.sdk.bean.Status;

/**
 * 账户
 * 
 * @since 3.9.3
 * @author <a href="mailto:sikai.wang@elanking.com">sikai.wang</a>
 * @version 2017年3月20日
 */
@Entity
@Table(name = "account")
public class Account implements Serializable {

	private static final long serialVersionUID = -688215496466867915L;

	@Id
	@GeneratedValue(generator = "snowflake")
	@GenericGenerator(name = "snowflake", strategy = SnowflakeGenerator.TYPE)
	private Long id;

	/**
	 * 账户名称
	 */
	@Column(length = 64, nullable = false, unique = true)
	private String name;

	/**
	 * 用户名是否可以更新(可以更新为Status.ENABLED,不可以更新为Status.DISABLED,为null时也不可更新)
	 */
	@Column(name = "name_update_status", precision = 3)
	private Status nameUpdateStatus = Status.ENABLED;

	/**
	 * 密码(MD5)
	 */
	@Column(length = 128, nullable = false)
	private String password;

	/**
	 * 密码状态 {@link PasswordStatus},用户设置过密码后一律设置成ENABLED
	 */
	@Column(name = "password_status", precision = 3, columnDefinition = "tinyint default 0")
	private PasswordStatus passwordStatus = PasswordStatus.ENABLED;

	/**
	 * 密码强度 1.弱;2.中;3.强
	 */
	@Column(name = "strength", precision = 3, columnDefinition = "tinyint default 2")
	private Integer strength = 2;

	/**
	 * 邮箱
	 */
	@Column(length = 128)
	private String email;

	/**
	 * 邮箱认证状态(认证过邮箱的设置为Status.ENABLED,未认证过邮箱的设置为Status.DISABLED)
	 */
	@Column(name = "email_status", precision = 3, columnDefinition = "tinyint default 1")
	private Status emailStatus = Status.DISABLED;

	/**
	 * 手机号码
	 */
	@Column(length = 20)
	private String mobile;

	/**
	 * 手机认证状态(认证过手机的设置为Status.ENABLED,未认证过手机的设置为Status.DISABLED)
	 */
	@Column(name = "mobile_status", precision = 3, columnDefinition = "tinyint default 1")
	private Status mobileStatus = Status.DISABLED;

	/**
	 * 密保手机
	 */
	@Column(length = 20, name = "password_mobile")
	private String passwordMobile;

	/**
	 * 密保状态(有密保的设置为Status.ENABLED,无密保的设置为Status.DISABLED)
	 */
	@Column(name = "pq_status", precision = 3, columnDefinition = "tinyint default 1")
	private Status pqStatus = Status.DISABLED;

	/**
	 * 注册时间
	 */
	@Column(name = "register_at", columnDefinition = "datetime(3)")
	private Date registerAt;

	/**
	 * 账户状态
	 */
	@Column(name = "status", precision = 3)
	private Status status = Status.DISABLED;

	/**
	 * 账户激活状态
	 * 
	 * <pre>
	 *  1.account创建时为Status.DISABLED,第一次登陆后设置为Status.ENABLED
	 *  2.字段添加后老数据此字段都为null,需要根据session和session_history中的记录做统一处理
	 * </pre>
	 * 
	 */
	@Column(name = "activation_status", precision = 3)
	private Status activationStatus = Status.DISABLED;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Status getNameUpdateStatus() {
		return nameUpdateStatus;
	}

	public void setNameUpdateStatus(Status nameUpdateStatus) {
		this.nameUpdateStatus = nameUpdateStatus;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public PasswordStatus getPasswordStatus() {
		return passwordStatus;
	}

	public void setPasswordStatus(PasswordStatus passwordStatus) {
		this.passwordStatus = passwordStatus;
	}

	public Integer getStrength() {
		return strength;
	}

	public void setStrength(Integer strength) {
		this.strength = strength;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Status getEmailStatus() {
		return emailStatus;
	}

	public void setEmailStatus(Status emailStatus) {
		this.emailStatus = emailStatus;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Status getMobileStatus() {
		return mobileStatus;
	}

	public void setMobileStatus(Status mobileStatus) {
		this.mobileStatus = mobileStatus;
	}

	public String getPasswordMobile() {
		return passwordMobile;
	}

	public void setPasswordMobile(String passwordMobile) {
		this.passwordMobile = passwordMobile;
	}

	public Status getPqStatus() {
		return pqStatus;
	}

	public void setPqStatus(Status pqStatus) {
		this.pqStatus = pqStatus;
	}

	public Date getRegisterAt() {
		return registerAt;
	}

	public void setRegisterAt(Date registerAt) {
		this.registerAt = registerAt;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Status getActivationStatus() {
		return activationStatus;
	}

	public void setActivationStatus(Status activationStatus) {
		this.activationStatus = activationStatus;
	}

}
