package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.guarletter.apply.refund response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-18 15:16:56
 */
public class MybankCreditLoantradeGuarletterApplyRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 4436939837352834225L;

	/** 
	 * 退款申请单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}
	public String getApplyNo( ) {
		return this.applyNo;
	}

}