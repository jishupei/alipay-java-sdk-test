package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * BizActionComsumedAmountDTO
 *
 * @author auto create
 * @since 1.0, 2022-07-15 16:21:31
 */
public class BizActionComsumedAmountDTO extends AlipayObject {

	private static final long serialVersionUID = 4623132681492856561L;

	/**
	 * 业务预算申请Code
	 */
	@ApiField("biz_budget_apply_code")
	private String bizBudgetApplyCode;

	/**
	 * 外部系统bizUkId
	 */
	@ApiField("biz_uk_id")
	private String bizUkId;

	/**
	 * 占用金额
	 */
	@ApiField("consumed_amount")
	private String consumedAmount;

	public String getBizBudgetApplyCode() {
		return this.bizBudgetApplyCode;
	}
	public void setBizBudgetApplyCode(String bizBudgetApplyCode) {
		this.bizBudgetApplyCode = bizBudgetApplyCode;
	}

	public String getBizUkId() {
		return this.bizUkId;
	}
	public void setBizUkId(String bizUkId) {
		this.bizUkId = bizUkId;
	}

	public String getConsumedAmount() {
		return this.consumedAmount;
	}
	public void setConsumedAmount(String consumedAmount) {
		this.consumedAmount = consumedAmount;
	}

}
