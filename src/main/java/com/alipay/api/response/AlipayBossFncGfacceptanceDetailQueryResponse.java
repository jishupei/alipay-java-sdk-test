package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GFAOpenAPIDetailQueryResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.gfacceptance.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-12-25 17:32:02
 */
public class AlipayBossFncGfacceptanceDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7575811325428215564L;

	/** 
	 * 业财受理详情查询结果
	 */
	@ApiField("result")
	private GFAOpenAPIDetailQueryResult result;

	public void setResult(GFAOpenAPIDetailQueryResult result) {
		this.result = result;
	}
	public GFAOpenAPIDetailQueryResult getResult( ) {
		return this.result;
	}

}
