package com.lanking.yc.ms.intelligentCorrection.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lanking.yc.ms.message.api.Message;

@Configuration
@ConfigurationProperties
@RestController
@RequestMapping("intelligentCorrection")
public class IntelligentCorrectionController {

	@Autowired
	private Message message;

	@RequestMapping(value = "info")
	public String info() {
		return message.info();
	}

}
