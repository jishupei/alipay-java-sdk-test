package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.balance.downloadurl.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-15 15:51:46
 */
public class AlipayCommerceEcBalanceDownloadurlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8691913326218151394L;

	/** 
	 * 对账单下载地址链接，获取连接后3分钟后未下载，链接地址失效。
	 */
	@ApiField("bill_download_url")
	private String billDownloadUrl;

	public void setBillDownloadUrl(String billDownloadUrl) {
		this.billDownloadUrl = billDownloadUrl;
	}
	public String getBillDownloadUrl( ) {
		return this.billDownloadUrl;
	}

}