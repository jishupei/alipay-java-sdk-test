package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.equity.service.card.sync response.
 * 
 * @author auto create
 * @since 1.0, 2021-03-02 20:25:16
 */
public class AntfortuneEquityServiceCardSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1439762126123441219L;

	/** 
	 * 是否同步成功
	 */
	@ApiField("syn_result")
	private Boolean synResult;

	public void setSynResult(Boolean synResult) {
		this.synResult = synResult;
	}
	public Boolean getSynResult( ) {
		return this.synResult;
	}

}
