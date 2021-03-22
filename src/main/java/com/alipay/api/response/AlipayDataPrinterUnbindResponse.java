package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.printer.unbind response.
 * 
 * @author auto create
 * @since 1.0, 2019-10-18 11:07:16
 */
public class AlipayDataPrinterUnbindResponse extends AlipayResponse {

	private static final long serialVersionUID = 1643627773264751625L;

	/** 
	 * 状态码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 描述
	 */
	@ApiField("message")
	private String message;

	/** 
	 * 状态
	 */
	@ApiField("status")
	private String status;

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
