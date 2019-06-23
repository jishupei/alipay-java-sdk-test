package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户画像信息，除基本信息，还支持会员等级、积分等画像信息。
 *
 * @author auto create
 * @since 1.0, 2019-02-27 20:49:21
 */
public class UserProfileDetail extends AlipayObject {

	private static final long serialVersionUID = 7165577337827762537L;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户发行主体;
ALIPAY:支付宝,TAOBAO:淘宝,MERCHANT:商户(星巴克)
	 */
	@ApiField("user_issuer")
	private String userIssuer;

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserIssuer() {
		return this.userIssuer;
	}
	public void setUserIssuer(String userIssuer) {
		this.userIssuer = userIssuer;
	}

}
