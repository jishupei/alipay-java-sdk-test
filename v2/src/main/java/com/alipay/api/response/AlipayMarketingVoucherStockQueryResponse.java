package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.voucher.stock.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-12 19:39:41
 */
public class AlipayMarketingVoucherStockQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7658764746161966937L;

	/** 
	 * 剩余可用库存数量
	 */
	@ApiField("available_count")
	private Long availableCount;

	/** 
	 * 库存总量
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setAvailableCount(Long availableCount) {
		this.availableCount = availableCount;
	}
	public Long getAvailableCount( ) {
		return this.availableCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
