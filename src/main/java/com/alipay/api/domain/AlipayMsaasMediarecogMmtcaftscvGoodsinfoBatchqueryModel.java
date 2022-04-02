package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 视觉货柜商品信息批量查询
 *
 * @author auto create
 * @since 1.0, 2022-03-31 15:02:12
 */
public class AlipayMsaasMediarecogMmtcaftscvGoodsinfoBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8128284919289499818L;

	/**
	 * 算法id列表
	 */
	@ApiListField("algorithm_ids")
	@ApiField("string")
	private List<String> algorithmIds;

	public List<String> getAlgorithmIds() {
		return this.algorithmIds;
	}
	public void setAlgorithmIds(List<String> algorithmIds) {
		this.algorithmIds = algorithmIds;
	}

}
