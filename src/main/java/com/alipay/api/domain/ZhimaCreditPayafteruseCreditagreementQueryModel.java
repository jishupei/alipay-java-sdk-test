package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 先用后付授权状态查询
 *
 * @author auto create
 * @since 1.0, 2021-10-29 16:25:52
 */
public class ZhimaCreditPayafteruseCreditagreementQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3862556823291155284L;

	/**
	 * 芝麻先用后付开通协议号，out_agreement_no与credit_agreement_id必填一个，推荐使用credit_agreement_id。
	 */
	@ApiField("credit_agreement_id")
	private String creditAgreementId;

	/**
	 * 商户外部协议号
	 */
	@ApiField("out_agreement_no")
	private String outAgreementNo;

	public String getCreditAgreementId() {
		return this.creditAgreementId;
	}
	public void setCreditAgreementId(String creditAgreementId) {
		this.creditAgreementId = creditAgreementId;
	}

	public String getOutAgreementNo() {
		return this.outAgreementNo;
	}
	public void setOutAgreementNo(String outAgreementNo) {
		this.outAgreementNo = outAgreementNo;
	}

}
