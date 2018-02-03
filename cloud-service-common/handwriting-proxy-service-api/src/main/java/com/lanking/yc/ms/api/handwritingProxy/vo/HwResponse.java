package com.lanking.yc.ms.api.handwritingProxy.vo;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class HwResponse implements Serializable {

	private static final long serialVersionUID = -3952190976418197259L;

	private long id;
	private String info;
	private String status;
	private String latex;
	private String mathml;
	private String asciimath;

}
