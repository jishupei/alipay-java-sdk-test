package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻活动预创单
 *
 * @author auto create
 * @since 1.0, 2022-03-02 14:19:01
 */
public class AlipayCommerceZhimaPreorderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3737966929653234986L;

	/**
	 * alipay_store_id
	 */
	@ApiField("alipay_store_id")
	private String alipayStoreId;

	/**
	 * 支付宝用户ID。同一个外部请求号，调用方要确保支付宝userId取值不变
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 业务发生时间，如2016-07-06 00:00:02 签约超时关单时间依赖这个时间 这个时间会做幂等校验，如果创单幂等，但时间不同会失败
	 */
	@ApiField("biz_time")
	private String bizTime;

	/**
	 * ISV商户ID
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 开放平台appId
	 */
	@ApiField("openapi_app_id")
	private String openapiAppId;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * storeId
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 芝麻GO活动模版id
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 超时关单时间 默认1H。1m～15d。m表示分钟，h表示小时，d表示天。该参数数值不接受小数点， 如1.5h，可转换为90m 签约超时关单时间依赖这个时间
	 */
	@ApiField("timeout_express")
	private String timeoutExpress;

	public String getAlipayStoreId() {
		return this.alipayStoreId;
	}
	public void setAlipayStoreId(String alipayStoreId) {
		this.alipayStoreId = alipayStoreId;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(String bizTime) {
		this.bizTime = bizTime;
	}

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	public String getOpenapiAppId() {
		return this.openapiAppId;
	}
	public void setOpenapiAppId(String openapiAppId) {
		this.openapiAppId = openapiAppId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getTimeoutExpress() {
		return this.timeoutExpress;
	}
	public void setTimeoutExpress(String timeoutExpress) {
		this.timeoutExpress = timeoutExpress;
	}

}
