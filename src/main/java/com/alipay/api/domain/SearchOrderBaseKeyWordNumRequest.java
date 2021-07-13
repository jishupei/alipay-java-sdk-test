package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询可配置基础关键词数量
 *
 * @author auto create
 * @since 1.0, 2021-07-12 16:46:28
 */
public class SearchOrderBaseKeyWordNumRequest extends AlipayObject {

	private static final long serialVersionUID = 8858119685699986296L;

	/**
	 * appid
	 */
	@ApiField("appid")
	private String appid;

	/**
	 * 应用类型
	 */
	@ApiField("spec_code")
	private String specCode;

	public String getAppid() {
		return this.appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getSpecCode() {
		return this.specCode;
	}
	public void setSpecCode(String specCode) {
		this.specCode = specCode;
	}

}