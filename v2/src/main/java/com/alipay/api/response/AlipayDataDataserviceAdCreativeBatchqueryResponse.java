package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PageCreative;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.creative.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2021-05-08 11:47:17
 */
public class AlipayDataDataserviceAdCreativeBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1617881979981349367L;

	/** 
	 * 创意按条件分页查询结果
	 */
	@ApiField("creative_list")
	private PageCreative creativeList;

	public void setCreativeList(PageCreative creativeList) {
		this.creativeList = creativeList;
	}
	public PageCreative getCreativeList( ) {
		return this.creativeList;
	}

}
