package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.mobileauth.sign.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-08 16:16:50
 */
public class AlipayPcreditHuabeiMobileauthSignConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 1465742299426994342L;

	/** 
	 * 模板查询返回JSON信息，参考 PcreditAuthSignConfirmResult
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
