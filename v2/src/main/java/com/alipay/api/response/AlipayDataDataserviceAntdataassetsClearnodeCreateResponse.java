package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.antdataassets.clearnode.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-04-30 14:25:27
 */
public class AlipayDataDataserviceAntdataassetsClearnodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5614756192983184667L;

	/** 
	 * 清除任务操作是否成功
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
