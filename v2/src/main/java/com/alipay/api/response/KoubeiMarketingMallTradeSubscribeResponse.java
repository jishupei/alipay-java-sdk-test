package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.mall.trade.subscribe response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-02 11:08:43
 */
public class KoubeiMarketingMallTradeSubscribeResponse extends AlipayResponse {

	private static final long serialVersionUID = 1616235128248883571L;

	/** 
	 * 申请工单id（用以查询申请工单状态）
	 */
	@ApiField("order_flow_id")
	private String orderFlowId;

	public void setOrderFlowId(String orderFlowId) {
		this.orderFlowId = orderFlowId;
	}
	public String getOrderFlowId( ) {
		return this.orderFlowId;
	}

}
