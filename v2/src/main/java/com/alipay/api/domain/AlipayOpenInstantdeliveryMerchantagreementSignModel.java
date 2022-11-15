package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 即时配送中商家代扣协议签署
 *
 * @author auto create
 * @since 1.0, 2022-11-08 10:41:36
 */
public class AlipayOpenInstantdeliveryMerchantagreementSignModel extends AlipayObject {

	private static final long serialVersionUID = 7418443387743663218L;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
