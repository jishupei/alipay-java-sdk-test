package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.appcontent.function.modify response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-13 20:57:33
 */
public class AlipayOpenAppAppcontentFunctionModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2825597351256966446L;

	/** 
	 * 服务编码
	 */
	@ApiField("service_code")
	private String serviceCode;

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	public String getServiceCode( ) {
		return this.serviceCode;
	}

}
