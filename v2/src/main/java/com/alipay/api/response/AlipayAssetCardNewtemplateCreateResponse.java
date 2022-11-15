package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.card.newtemplate.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-12 19:37:41
 */
public class AlipayAssetCardNewtemplateCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8555991578824625445L;

	/** 
	 * 模板id
	 */
	@ApiField("template_id")
	private String templateId;

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	public String getTemplateId( ) {
		return this.templateId;
	}

}
