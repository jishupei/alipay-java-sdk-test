package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家安心充配置查询
 *
 * @author auto create
 * @since 1.0, 2022-03-22 14:04:18
 */
public class AntMerchantExpandMembercardConfigQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3229512166136159929L;

	/**
	 * 商家的安心充配置的唯一编号，
如果有可以传；不传优先pid查询
	 */
	@ApiField("member_product_id")
	private String memberProductId;

	public String getMemberProductId() {
		return this.memberProductId;
	}
	public void setMemberProductId(String memberProductId) {
		this.memberProductId = memberProductId;
	}

}
