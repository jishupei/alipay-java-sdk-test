package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.LargeInfiniteCardInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.service.account.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-03-23 11:22:55
 */
public class AlipayTradeServiceAccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1852154411667522856L;

	/** 
	 * 无限付产品账户卡信息
	 */
	@ApiField("large_infinite_card_info")
	private LargeInfiniteCardInfo largeInfiniteCardInfo;

	public void setLargeInfiniteCardInfo(LargeInfiniteCardInfo largeInfiniteCardInfo) {
		this.largeInfiniteCardInfo = largeInfiniteCardInfo;
	}
	public LargeInfiniteCardInfo getLargeInfiniteCardInfo( ) {
		return this.largeInfiniteCardInfo;
	}

}
