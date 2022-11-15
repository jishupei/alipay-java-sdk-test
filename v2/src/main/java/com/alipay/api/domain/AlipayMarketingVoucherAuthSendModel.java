package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发送资金券
 *
 * @author auto create
 * @since 1.0, 2022-10-12 19:38:46
 */
public class AlipayMarketingVoucherAuthSendModel extends AlipayObject {

	private static final long serialVersionUID = 3522597395532866813L;

	/**
	 * 外部业务订单号，用于幂等控制
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 经过用户授权过后的发券码
	 */
	@ApiField("send_code")
	private String sendCode;

	/**
	 * 券模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getSendCode() {
		return this.sendCode;
	}
	public void setSendCode(String sendCode) {
		this.sendCode = sendCode;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
