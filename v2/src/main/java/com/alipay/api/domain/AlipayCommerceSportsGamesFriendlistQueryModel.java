package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询支付宝好友列表
 *
 * @author auto create
 * @since 1.0, 2021-01-14 15:25:14
 */
public class AlipayCommerceSportsGamesFriendlistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6128947253947475142L;

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
