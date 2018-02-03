package com.lanking.yc.ms.api.handwritingProxy.vo;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class HwRequest implements Serializable {

	private static final long serialVersionUID = 6892590648748572959L;

	private long id;
	private String info;
	private String scg_ink;

}
