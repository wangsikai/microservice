package com.lanking.yc.ms.message.api.fallback;

import org.springframework.stereotype.Component;

import com.lanking.yc.ms.message.api.Message;

@Component
public class MessageFallback implements Message {

	@Override
	public String info() {
		return "-1";
	}

}
