package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户协议鉴权查询结果
 *
 * @author auto create
 * @since 1.0, 2022-03-01 11:03:12
 */
public class AlipayUserAgreementUserverifyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5878737541947586435L;

	/**
	 * 协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 申请时获取的token
	 */
	@ApiField("apply_token")
	private String applyToken;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getApplyToken() {
		return this.applyToken;
	}
	public void setApplyToken(String applyToken) {
		this.applyToken = applyToken;
	}

}
