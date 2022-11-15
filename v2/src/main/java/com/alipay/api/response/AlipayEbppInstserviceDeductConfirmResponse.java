package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.instservice.deduct.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-07 16:51:46
 */
public class AlipayEbppInstserviceDeductConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 1558244214541775285L;

	/** 
	 * 错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * alipay_sign代表支付宝侧签约成功 enable代表协议生效 alipay_unsign代表支付宝侧解约成功 disable代表协议失效 如果机构未提供签约接口，则只关注协议是否生效
	 */
	@ApiField("status")
	private String status;

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
