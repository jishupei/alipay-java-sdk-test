package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.assetmanage.penetratebill.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-21 15:17:13
 */
public class AnttechBlockchainFinanceAssetmanagePenetratebillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2255441483746678337L;

	/** 
	 * 账单下载地址
	 */
	@ApiField("download_url")
	private String downloadUrl;

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}
	public String getDownloadUrl( ) {
		return this.downloadUrl;
	}

}
