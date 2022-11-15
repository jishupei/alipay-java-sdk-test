package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 取消订单或退货指令接收反馈接口
 *
 * @author auto create
 * @since 1.0, 2021-11-19 16:03:11
 */
public class AntMerchantExpandAssetreverseAssignSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8726768178443995386L;

	/**
	 * 取消订单或退货指令接收反馈，最多200条
	 */
	@ApiListField("reverse_results")
	@ApiField("asset_result")
	private List<AssetResult> reverseResults;

	public List<AssetResult> getReverseResults() {
		return this.reverseResults;
	}
	public void setReverseResults(List<AssetResult> reverseResults) {
		this.reverseResults = reverseResults;
	}

}
