package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券发放相关规则
 *
 * @author auto create
 * @since 1.0, 2021-04-24 14:58:03
 */
public class VoucherSendRule extends AlipayObject {

	private static final long serialVersionUID = 1816313882364145242L;

	/**
	 * 是否开启自然人限制。自然人表示按照身份证纬度进行领取限制
	 */
	@ApiField("natural_person_limit")
	private Boolean naturalPersonLimit;

	/**
	 * 是否开启电话号码限制
	 */
	@ApiField("phone_number_limit")
	private Boolean phoneNumberLimit;

	/**
	 * 拟发行券的数量。单位为张。该数值必须是大于0的整数。

MERCHANT_UPLOAD模式下数量必须为0或者选择不填，默认为0
	 */
	@ApiField("voucher_quantity")
	private Long voucherQuantity;

	/**
	 * 每人领取限，默认按照支付宝uid进行领取限制；

不填写默认没有领取限制.
	 */
	@ApiField("voucher_single_restriction")
	private Long voucherSingleRestriction;

	public Boolean getNaturalPersonLimit() {
		return this.naturalPersonLimit;
	}
	public void setNaturalPersonLimit(Boolean naturalPersonLimit) {
		this.naturalPersonLimit = naturalPersonLimit;
	}

	public Boolean getPhoneNumberLimit() {
		return this.phoneNumberLimit;
	}
	public void setPhoneNumberLimit(Boolean phoneNumberLimit) {
		this.phoneNumberLimit = phoneNumberLimit;
	}

	public Long getVoucherQuantity() {
		return this.voucherQuantity;
	}
	public void setVoucherQuantity(Long voucherQuantity) {
		this.voucherQuantity = voucherQuantity;
	}

	public Long getVoucherSingleRestriction() {
		return this.voucherSingleRestriction;
	}
	public void setVoucherSingleRestriction(Long voucherSingleRestriction) {
		this.voucherSingleRestriction = voucherSingleRestriction;
	}

}