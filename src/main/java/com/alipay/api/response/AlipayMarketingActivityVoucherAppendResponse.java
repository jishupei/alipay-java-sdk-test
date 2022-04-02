package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.voucher.append response.
 * 
 * @author auto create
 * @since 1.0, 2022-02-23 14:07:55
 */
public class AlipayMarketingActivityVoucherAppendResponse extends AlipayResponse {

	private static final long serialVersionUID = 5246171378569679645L;

	/** 
	 * 预充值链接
限制
1、有效时间3天
	 */
	@ApiField("recharge_url")
	private String rechargeUrl;

	public void setRechargeUrl(String rechargeUrl) {
		this.rechargeUrl = rechargeUrl;
	}
	public String getRechargeUrl( ) {
		return this.rechargeUrl;
	}

}
