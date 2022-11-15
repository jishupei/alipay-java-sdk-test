package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * isv查询小程序预创建申请
 *
 * @author auto create
 * @since 1.0, 2022-11-02 23:46:01
 */
public class AlipayOpenMiniIsvQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3195133355637837312L;

	/**
	 * 服务商代商家创建小程序，由支付宝开放平台返回的订单号用于后续查询处理进展。
	 */
	@ApiField("order_no")
	private String orderNo;

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

}
