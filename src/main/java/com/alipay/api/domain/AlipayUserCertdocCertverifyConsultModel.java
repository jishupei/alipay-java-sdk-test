package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 实名证件信息比对验证咨询
 *
 * @author auto create
 * @since 1.0, 2021-03-03 15:17:10
 */
public class AlipayUserCertdocCertverifyConsultModel extends AlipayObject {

	private static final long serialVersionUID = 4829385832312194788L;

	/**
	 * 信息校验验证ID
	 */
	@ApiField("verify_id")
	private String verifyId;

	public String getVerifyId() {
		return this.verifyId;
	}
	public void setVerifyId(String verifyId) {
		this.verifyId = verifyId;
	}

}
