package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.search.serviceorder.modify response.
 * 
 * @author auto create
 * @since 1.0, 2021-08-19 14:19:39
 */
public class AlipayOpenSearchServiceorderModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2237656898298159164L;

	/** 
	 * 申请单的申请单id，applyid
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
