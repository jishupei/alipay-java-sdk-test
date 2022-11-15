package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业认证引导(页面接口)
 *
 * @author auto create
 * @since 1.0, 2022-10-28 15:14:20
 */
public class ZhimaCustomerEpCertificationCertifyModel extends AlipayObject {

	private static final long serialVersionUID = 2847857635581913766L;

	/**
	 * 一次认证的唯一标识，通过<a href="https://opendocs.alipay.com/apis/api_8/zhima.customer.ep.certification.initialize">zhima.customer.ep.certification.initialize</a>(企业认证初始化)接口完成芝麻认证初始化后获取。
	 */
	@ApiField("biz_no")
	private String bizNo;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

}
