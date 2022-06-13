package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 预算申请
 *
 * @author auto create
 * @since 1.0, 2022-05-19 14:25:56
 */
public class AlipayBossFncAntbudgetApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7716739369749389563L;

	/**
	 * 申请参数列表
	 */
	@ApiListField("apply_biz_budget_request_list")
	@ApiField("apply_biz_budget_request")
	private List<ApplyBizBudgetRequest> applyBizBudgetRequestList;

	/**
	 * 幂等字段
	 */
	@ApiField("idempotent_id")
	private String idempotentId;

	public List<ApplyBizBudgetRequest> getApplyBizBudgetRequestList() {
		return this.applyBizBudgetRequestList;
	}
	public void setApplyBizBudgetRequestList(List<ApplyBizBudgetRequest> applyBizBudgetRequestList) {
		this.applyBizBudgetRequestList = applyBizBudgetRequestList;
	}

	public String getIdempotentId() {
		return this.idempotentId;
	}
	public void setIdempotentId(String idempotentId) {
		this.idempotentId = idempotentId;
	}

}
