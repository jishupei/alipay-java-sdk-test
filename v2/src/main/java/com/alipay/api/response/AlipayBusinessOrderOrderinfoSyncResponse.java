package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.business.order.orderinfo.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-26 16:07:15
 */
public class AlipayBusinessOrderOrderinfoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3419279276562626736L;

	/** 
	 * 订单id
	 */
	@ApiField("object_id")
	private String objectId;

	/** 
	 * 订单状态
	 */
	@ApiField("status")
	private String status;

	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}
	public String getObjectId( ) {
		return this.objectId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
