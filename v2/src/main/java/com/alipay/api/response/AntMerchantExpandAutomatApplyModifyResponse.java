package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.automat.apply.modify response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-21 11:26:47
 */
public class AntMerchantExpandAutomatApplyModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5383384624718611123L;

	/** 
	 * 支付宝设备ID
	 */
	@ApiField("alipay_terminal_id")
	private String alipayTerminalId;

	public void setAlipayTerminalId(String alipayTerminalId) {
		this.alipayTerminalId = alipayTerminalId;
	}
	public String getAlipayTerminalId( ) {
		return this.alipayTerminalId;
	}

}
