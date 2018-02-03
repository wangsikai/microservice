package com.lanking.yc.ms.handwritingProxy.service;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;

import com.lanking.yc.ms.api.handwritingProxy.vo.HwRequest;
import com.lanking.yc.ms.api.handwritingProxy.vo.HwResponse;

public interface HandwritingRecordService {

	void record(HwRequest hwRequest);

	HwResponse proxy(HwRequest hwRequest) throws ClientProtocolException, IOException;

	void response(HwResponse hwResponse);
}
