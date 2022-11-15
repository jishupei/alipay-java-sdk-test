package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 一体机全量数据回流
 *
 * @author auto create
 * @since 1.0, 2022-10-11 12:05:54
 */
public class KoubeiTradePosDataSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3281752153254628788L;

	/**
	 * 回流规则码，不同的规则码对应不同的回流规范，枚举如下
SYNC_001 对应餐饮业态点单产品回流规范
SYNC_002 对应零售业态售卖产品回流规范
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * JSON格式，描述业务信息，根据回流规范文档传入。
	 */
	@ApiField("content")
	private String content;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

}
