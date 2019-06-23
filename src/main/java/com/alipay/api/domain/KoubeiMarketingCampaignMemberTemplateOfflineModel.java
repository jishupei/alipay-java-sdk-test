package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员模板失效
 *
 * @author auto create
 * @since 1.0, 2018-11-30 15:36:52
 */
public class KoubeiMarketingCampaignMemberTemplateOfflineModel extends AlipayObject {

	private static final long serialVersionUID = 1373847843593193391L;

	/**
	 * 会员模板id
	 */
	@ApiField("member_template_id")
	private String memberTemplateId;

	/**
	 * 请求ID，由开发者生成并保证唯一性
	 */
	@ApiField("request_id")
	private String requestId;

	public String getMemberTemplateId() {
		return this.memberTemplateId;
	}
	public void setMemberTemplateId(String memberTemplateId) {
		this.memberTemplateId = memberTemplateId;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
