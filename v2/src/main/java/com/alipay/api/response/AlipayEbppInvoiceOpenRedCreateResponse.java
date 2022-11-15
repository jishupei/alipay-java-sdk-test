package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.open.red.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-24 16:06:45
 */
public class AlipayEbppInvoiceOpenRedCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5126129263617368387L;

	/** 
	 * 发票生成的开票申请流水id，查询开票结果使用改值
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
