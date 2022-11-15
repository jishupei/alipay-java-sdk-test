package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业财核算受理
 *
 * @author auto create
 * @since 1.0, 2022-11-08 15:01:11
 */
public class AlipayBossFncGfacceptanceAccountingAcceptModel extends AlipayObject {

	private static final long serialVersionUID = 1152446418736824155L;

	/**
	 * 核算受理
	 */
	@ApiField("accounting_acceptance")
	private GFAOpenAPIAccountingAcceptance accountingAcceptance;

	/**
	 * 16位。支付宝UID或者2088000000000XX0，倒数2、3位数字用来决策LDC ZoneUid和分库位
	 */
	@ApiField("principal_id")
	private String principalId;

	public GFAOpenAPIAccountingAcceptance getAccountingAcceptance() {
		return this.accountingAcceptance;
	}
	public void setAccountingAcceptance(GFAOpenAPIAccountingAcceptance accountingAcceptance) {
		this.accountingAcceptance = accountingAcceptance;
	}

	public String getPrincipalId() {
		return this.principalId;
	}
	public void setPrincipalId(String principalId) {
		this.principalId = principalId;
	}

}
