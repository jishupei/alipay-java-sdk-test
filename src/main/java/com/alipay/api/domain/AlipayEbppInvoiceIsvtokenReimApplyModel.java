package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取报销授权令牌
 *
 * @author auto create
 * @since 1.0, 2020-08-18 14:51:01
 */
public class AlipayEbppInvoiceIsvtokenReimApplyModel extends AlipayObject {

	private static final long serialVersionUID = 5822423831879582464L;

	/**
	 * 报销软件app对应的isv app code，由支付宝进行分配。详情参见 <a href="https://opendocs.alipay.com/open/017fwh">"推"模式发票报销</a>
	 */
	@ApiField("isv_app_code")
	private String isvAppCode;

	public String getIsvAppCode() {
		return this.isvAppCode;
	}
	public void setIsvAppCode(String isvAppCode) {
		this.isvAppCode = isvAppCode;
	}

}
