package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供应商-1688和赊呗融合-额度查询接口
 *
 * @author auto create
 * @since 1.0, 2022-05-20 11:41:32
 */
public class MybankCreditSupplychainCreditpayAmountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8238546866574298552L;

	/**
	 * 品牌额度查询条件
	 */
	@ApiField("brand_quota_query_condition")
	private BrandQuotaQueryCondition brandQuotaQueryCondition;

	/**
	 * 买方信息，这里是ISV的信息
	 */
	@ApiField("buyer")
	private Member buyer;

	/**
	 * 平台类型
	 */
	@ApiField("channel_tag")
	private String channelTag;

	/**
	 * Trace信息
	 */
	@ApiField("trace_id")
	private String traceId;

	public BrandQuotaQueryCondition getBrandQuotaQueryCondition() {
		return this.brandQuotaQueryCondition;
	}
	public void setBrandQuotaQueryCondition(BrandQuotaQueryCondition brandQuotaQueryCondition) {
		this.brandQuotaQueryCondition = brandQuotaQueryCondition;
	}

	public Member getBuyer() {
		return this.buyer;
	}
	public void setBuyer(Member buyer) {
		this.buyer = buyer;
	}

	public String getChannelTag() {
		return this.channelTag;
	}
	public void setChannelTag(String channelTag) {
		this.channelTag = channelTag;
	}

	public String getTraceId() {
		return this.traceId;
	}
	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

}
