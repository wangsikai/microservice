package com.lanking.yc.ms.message.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("message")
public class MessageController {

	@RequestMapping(value = "info")
	public String info() {
		return "this is message service";
	}
}
