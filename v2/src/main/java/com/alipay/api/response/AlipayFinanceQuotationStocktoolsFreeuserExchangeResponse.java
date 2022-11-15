package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.finance.quotation.stocktools.freeuser.exchange response.
 * 
 * @author auto create
 * @since 1.0, 2022-02-21 11:12:21
 */
public class AlipayFinanceQuotationStocktoolsFreeuserExchangeResponse extends AlipayResponse {

	private static final long serialVersionUID = 6783356829595381713L;

	/** 
	 * 领取成功/失败，此处为false时，或者接口本身报错时，均意味着失败
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
