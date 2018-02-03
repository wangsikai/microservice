package com.lanking.yc.ms.message.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lanking.yc.ms.message.api.fallback.MessageFallback;

@FeignClient(name = "message-service", fallback = MessageFallback.class)
public interface Message {

	@RequestMapping(value = "message/info")
	public String info();
}
