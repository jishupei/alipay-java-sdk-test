package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.prepayment.apply response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-21 17:39:50
 */
public class MybankCreditSupplychainPrepaymentApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7454848443395214239L;

	/** 
	 * 预付申请单编号。
	 */
	@ApiField("prepayment_apply_no")
	private String prepaymentApplyNo;

	public void setPrepaymentApplyNo(String prepaymentApplyNo) {
		this.prepaymentApplyNo = prepaymentApplyNo;
	}
	public String getPrepaymentApplyNo( ) {
		return this.prepaymentApplyNo;
	}

}
