package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订单券导入券码
 *
 * @author auto create
 * @since 1.0, 2022-09-19 16:40:15
 */
public class AlipayMarketingActivityOrdervoucherCodedepositModel extends AlipayObject {

	private static final long serialVersionUID = 5386529295541151994L;

	/**
	 * 活动id

限制
请在接收alipay.marketing.activity.message.created消息后，再进行调用。
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 商户接入模式

枚举值
SELF_MODE 商户自接入模式
AGENCY_MODE 服务商代接入模式
	 */
	@ApiField("merchant_access_mode")
	private String merchantAccessMode;

	/**
	 * 外部业务单号，用作幂等控制。

幂等作用：
参数不变的情况下，再次请求返回与上一次相同的结果。

外部接入方需保证业务单号唯一。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 券码的数量列表。接口参数为列表类型。

限制：
目前最大上传 1000 个。

单个code最长64位。

商户上传的券code列表，code允许包含的字符有0-9、a-z、A-Z、-、_、+、=、|。
	 */
	@ApiListField("voucher_codes")
	@ApiField("string")
	private List<String> voucherCodes;

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

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public List<String> getVoucherCodes() {
		return this.voucherCodes;
	}
	public void setVoucherCodes(List<String> voucherCodes) {
		this.voucherCodes = voucherCodes;
	}

}
