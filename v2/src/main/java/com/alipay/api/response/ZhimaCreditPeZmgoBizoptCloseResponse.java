package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.zmgo.bizopt.close response.
 * 
 * @author auto create
 * @since 1.0, 2021-02-24 19:05:15
 */
public class ZhimaCreditPeZmgoBizoptCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 1173838111697633548L;

	/** 
	 * 芝麻GO签约申请时生成的签约申请单据号
	 */
	@ApiField("biz_opt_no")
	private String bizOptNo;

	/** 
	 * 商户本次操作的请求流水号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/** 
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public void setBizOptNo(String bizOptNo) {
		this.bizOptNo = bizOptNo;
	}
	public String getBizOptNo( ) {
		return this.bizOptNo;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	public String getPartnerId( ) {
		return this.partnerId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
