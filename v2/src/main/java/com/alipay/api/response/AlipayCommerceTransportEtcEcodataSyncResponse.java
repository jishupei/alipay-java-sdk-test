package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.etc.ecodata.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-26 14:16:51
 */
public class AlipayCommerceTransportEtcEcodataSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7416155187463371587L;

	/** 
	 * 域内业务号，对应用户该笔ETC申请单号
	 */
	@ApiField("alipay_biz_no")
	private String alipayBizNo;

	/** 
	 * 同步结果，true/false
	 */
	@ApiField("sync_result")
	private Boolean syncResult;

	public void setAlipayBizNo(String alipayBizNo) {
		this.alipayBizNo = alipayBizNo;
	}
	public String getAlipayBizNo( ) {
		return this.alipayBizNo;
	}

	public void setSyncResult(Boolean syncResult) {
		this.syncResult = syncResult;
	}
	public Boolean getSyncResult( ) {
		return this.syncResult;
	}

}
