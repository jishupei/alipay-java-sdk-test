package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 学分查询接口
 *
 * @author auto create
 * @since 1.0, 2022-08-19 17:22:15
 */
public class AlipayCommerceEducateCreditbankCreditQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8183141528659473248L;

	/**
	 * 学分银行ID
	 */
	@ApiField("cb_id")
	private String cbId;

	/**
	 * 渠道，默认值：shcreditbank(上海学分银行)
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getCbId() {
		return this.cbId;
	}
	public void setCbId(String cbId) {
		this.cbId = cbId;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
