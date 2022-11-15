package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.iotdevice.recycle.modify response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-21 11:25:25
 */
public class AntMerchantExpandIotdeviceRecycleModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6844154287852178639L;

	/** 
	 * 业务处理订单号
	 */
	@ApiField("biz_order_id")
	private String bizOrderId;

	public void setBizOrderId(String bizOrderId) {
		this.bizOrderId = bizOrderId;
	}
	public String getBizOrderId( ) {
		return this.bizOrderId;
	}

}
