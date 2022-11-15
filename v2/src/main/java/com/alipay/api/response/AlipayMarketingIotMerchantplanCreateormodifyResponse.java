package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.iot.merchantplan.createormodify response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-29 15:02:59
 */
public class AlipayMarketingIotMerchantplanCreateormodifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5362376299426998998L;

	/** 
	 * 商家活动ID
	 */
	@ApiField("merchant_plan_id")
	private String merchantPlanId;

	public void setMerchantPlanId(String merchantPlanId) {
		this.merchantPlanId = merchantPlanId;
	}
	public String getMerchantPlanId( ) {
		return this.merchantPlanId;
	}

}
