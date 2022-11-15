package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.financialnet.auth.payment.notify response.
 * 
 * @author auto create
 * @since 1.0, 2021-01-15 11:35:18
 */
public class AlipayFinancialnetAuthPaymentNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1818442528391187226L;

	/** 
	 * 响应结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 响应结果描述
	 */
	@ApiField("result_desc")
	private String resultDesc;

	/** 
	 * 业务结果是否成功
	 */
	@ApiField("success")
	private String success;

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}
	public String getResultDesc( ) {
		return this.resultDesc;
	}

	public void setSuccess(String success) {
		this.success = success;
	}
	public String getSuccess( ) {
		return this.success;
	}

}
