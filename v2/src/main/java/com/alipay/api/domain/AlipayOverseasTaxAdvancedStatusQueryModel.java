package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预授权退税状态查询
 *
 * @author auto create
 * @since 1.0, 2022-10-12 13:42:48
 */
public class AlipayOverseasTaxAdvancedStatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4216221995738915769L;

	/**
	 * 退税机构业务流水号，唯一，只能包含字母、数字
	 */
	@ApiField("out_tax_refund_no")
	private String outTaxRefundNo;

	public String getOutTaxRefundNo() {
		return this.outTaxRefundNo;
	}
	public void setOutTaxRefundNo(String outTaxRefundNo) {
		this.outTaxRefundNo = outTaxRefundNo;
	}

}
