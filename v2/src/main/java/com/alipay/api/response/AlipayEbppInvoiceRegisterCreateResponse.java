package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.register.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:13:20
 */
public class AlipayEbppInvoiceRegisterCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3757776928636287886L;

	/** 
	 * 入驻工单ID，发票中台生成
	 */
	@ApiField("register_id")
	private String registerId;

	public void setRegisterId(String registerId) {
		this.registerId = registerId;
	}
	public String getRegisterId( ) {
		return this.registerId;
	}

}
