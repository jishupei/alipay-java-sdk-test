package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotmbs.facedb.delete response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-08 14:31:41
 */
public class AlipayOpenIotmbsFacedbDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 5646499923421716576L;

	/** 
	 * 成功true失败false
	 */
	@ApiField("success")
	private Boolean success;

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
