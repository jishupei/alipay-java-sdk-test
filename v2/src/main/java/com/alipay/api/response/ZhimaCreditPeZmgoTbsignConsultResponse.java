package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.zmgo.tbsign.consult response.
 * 
 * @author auto create
 * @since 1.0, 2021-05-11 20:30:19
 */
public class ZhimaCreditPeZmgoTbsignConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 5561748241447769459L;

	/** 
	 * 签约咨询返回的JSON信息
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
