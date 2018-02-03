package com.lanking.yc.domain.handwritingProxy;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "hw_record")
public class HandwritingRecord implements Serializable {

	private static final long serialVersionUID = -5563040258338224551L;

	@Id
	private Long id;

	@Lob
	@org.hibernate.annotations.Type(type = "text")
	@Column(name = "scg_ink")
	private String scgInk;

	@Lob
	@org.hibernate.annotations.Type(type = "text")
	@Column(name = "response")
	private String response;

	@Column(name = "request_at", columnDefinition = "datetime(3)")
	private Date requestAt;

	@Column(name = "response_at", columnDefinition = "datetime(3)")
	private Date responseAt;

}
