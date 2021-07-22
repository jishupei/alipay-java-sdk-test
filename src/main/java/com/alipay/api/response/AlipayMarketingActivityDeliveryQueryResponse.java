package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PromoDeliveryInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.delivery.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-21 13:35:22
 */
public class AlipayMarketingActivityDeliveryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5591315189925566869L;

	/** 
	 * 投放信息列表
	 */
	@ApiListField("delivery_info_list")
	@ApiField("promo_delivery_info")
	private List<PromoDeliveryInfo> deliveryInfoList;

	public void setDeliveryInfoList(List<PromoDeliveryInfo> deliveryInfoList) {
		this.deliveryInfoList = deliveryInfoList;
	}
	public List<PromoDeliveryInfo> getDeliveryInfoList( ) {
		return this.deliveryInfoList;
	}

}