package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.applyorder.status.sync response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-21 11:29:18
 */
public class AlipayCommerceIotApplyorderStatusSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4167477234642295196L;

	/** 
	 * 该订单下关联的设备数量
	 */
	@ApiField("device_amount")
	private Long deviceAmount;

	public void setDeviceAmount(Long deviceAmount) {
		this.deviceAmount = deviceAmount;
	}
	public Long getDeviceAmount( ) {
		return this.deviceAmount;
	}

}
