package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.information.upload response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:12:38
 */
public class AlipayCommerceMedicalInformationUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 6671341359269423171L;

	/** 
	 * 报备成功时间
	 */
	@ApiField("gmt_payment")
	private Date gmtPayment;

	/** 
	 * 根据各地人社局返回为准，与入参数request_content对应的业务响应数据。
	 */
	@ApiField("response_content")
	private String responseContent;

	public void setGmtPayment(Date gmtPayment) {
		this.gmtPayment = gmtPayment;
	}
	public Date getGmtPayment( ) {
		return this.gmtPayment;
	}

	public void setResponseContent(String responseContent) {
		this.responseContent = responseContent;
	}
	public String getResponseContent( ) {
		return this.responseContent;
	}

}
