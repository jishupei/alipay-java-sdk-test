package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.sceneprod.benefit.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-04-19 17:49:56
 */
public class AlipayPcreditHuabeiSceneprodBenefitCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6812791942136126633L;

	/** 
	 * 权益ID，创建成功后返回
	 */
	@ApiField("benefit_id")
	private String benefitId;

	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}
	public String getBenefitId( ) {
		return this.benefitId;
	}

}
