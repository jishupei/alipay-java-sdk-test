package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询支付宝用户网商贷信息-智慧县域小程序专用
 *
 * @author auto create
 * @since 1.0, 2022-09-26 19:10:06
 */
public class MybankCreditLoanapplySmartcountyLoaninfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5751625825797367613L;

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
