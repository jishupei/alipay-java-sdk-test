package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.search.baseorder.modify response.
 * 
 * @author auto create
 * @since 1.0, 2022-02-10 17:06:42
 */
public class AlipayOpenSearchBaseorderModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1662769932265458373L;

	/** 
	 * 工单id
	 */
	@ApiField("apply_id")
	private String applyId;

	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}
	public String getApplyId( ) {
		return this.applyId;
	}

}
