package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.shop.mall.page.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-02 11:10:32
 */
public class KoubeiShopMallPageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1379854629851978593L;

	/** 
	 * 商圈首页url地址
	 */
	@ApiField("mall_url")
	private String mallUrl;

	public void setMallUrl(String mallUrl) {
		this.mallUrl = mallUrl;
	}
	public String getMallUrl( ) {
		return this.mallUrl;
	}

}
