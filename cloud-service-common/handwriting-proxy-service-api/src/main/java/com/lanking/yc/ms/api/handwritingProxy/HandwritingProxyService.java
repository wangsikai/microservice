package com.lanking.yc.ms.api.handwritingProxy;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lanking.yc.ms.api.handwritingProxy.vo.HwRequest;
import com.lanking.yc.ms.api.handwritingProxy.vo.HwResponse;

public interface HandwritingProxyService {

	@RequestMapping(value = "mathreco")
	HwResponse mathreco(@RequestBody HwRequest hwRequest);
}
