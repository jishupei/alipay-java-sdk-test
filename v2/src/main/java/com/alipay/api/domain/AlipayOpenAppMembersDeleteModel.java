package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除小程序成员
 *
 * @author auto create
 * @since 1.0, 2022-11-01 10:08:15
 */
public class AlipayOpenAppMembersDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 7698545251684516951L;

	/**
	 * 被删除成员的openId。
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 被删除成员的角色类型，枚举支持：
DEVELOPER：开发者。
EXPERIENCER：体验者。
	 */
	@ApiField("role")
	private String role;

	/**
	 * 被删除成员的支付宝账户唯一标识，以2088开头。
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getRole() {
		return this.role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
