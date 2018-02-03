package com.lanking.yc.ms.handwritingProxy.rest;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lanking.yc.ms.api.handwritingProxy.HandwritingProxyService;
import com.lanking.yc.ms.api.handwritingProxy.vo.HwRequest;
import com.lanking.yc.ms.api.handwritingProxy.vo.HwResponse;
import com.lanking.yc.ms.handwritingProxy.service.HandwritingRecordService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping
public class HandwritingProxyController implements HandwritingProxyService {

	@Autowired
	private HandwritingRecordService handwritingRecordService;

	@Override
	public HwResponse mathreco(HwRequest hwRequest) {
		hwRequest.setId(System.currentTimeMillis());

		handwritingRecordService.record(hwRequest);
		HwResponse hwResponse = null;
		try {
			hwResponse = handwritingRecordService.proxy(hwRequest);
		} catch (IOException e) {
			log.error("proxy error:", e);
		} finally {
			if (hwResponse != null) {
				handwritingRecordService.response(hwResponse);
			}
		}
		return hwResponse;
	}

}
