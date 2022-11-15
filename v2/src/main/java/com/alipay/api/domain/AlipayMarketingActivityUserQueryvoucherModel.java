package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户券详情
 *
 * @author auto create
 * @since 1.0, 2022-10-26 17:07:12
 */
public class AlipayMarketingActivityUserQueryvoucherModel extends AlipayObject {

	private static final long serialVersionUID = 2399116416438155346L;

	/**
	 * 活动 id。
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 商户接入模式。
	 */
	@ApiField("merchant_access_mode")
	private String merchantAccessMode;

	/**
	 * 商户 PID，默认为当前接口调用商户。
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 支付宝用户openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户领取的商家券券码。
	 */
	@ApiField("voucher_code")
	private String voucherCode;

	/**
	 * 用户券 id。支付宝为用户优惠券唯一分配的 id。
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getMerchantAccessMode() {
		return this.merchantAccessMode;
	}
	public void setMerchantAccessMode(String merchantAccessMode) {
		this.merchantAccessMode = merchantAccessMode;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getVoucherCode() {
		return this.voucherCode;
	}
	public void setVoucherCode(String voucherCode) {
		this.voucherCode = voucherCode;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
