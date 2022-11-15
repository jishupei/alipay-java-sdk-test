package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 额度模型
 *
 * @author auto create
 * @since 1.0, 2022-09-28 16:59:44
 */
public class JointAccountQuotaDTO extends AlipayObject {

	private static final long serialVersionUID = 8525182297225285799L;

	/**
	 * 自定义周期起始日期，精确到分钟，yyyy-MM-dd HH:mm
	 */
	@ApiField("custom_begin_date")
	private String customBeginDate;

	/**
	 * 自定义周期结束日期，精确到分钟，yyyy-MM-dd HH:mm
	 */
	@ApiField("custom_end_date")
	private String customEndDate;

	/**
	 * 额度维度
日：DAY
月：MONTH
年：YEAR
终身：LIFETIME
自定义周期：CUSTOMIZED，需要传自定义周期时间区间
	 */
	@ApiField("quota_dimension")
	private String quotaDimension;

	/**
	 * 协议额度
	 */
	@ApiField("quota_total")
	private String quotaTotal;

	public String getCustomBeginDate() {
		return this.customBeginDate;
	}
	public void setCustomBeginDate(String customBeginDate) {
		this.customBeginDate = customBeginDate;
	}

	public String getCustomEndDate() {
		return this.customEndDate;
	}
	public void setCustomEndDate(String customEndDate) {
		this.customEndDate = customEndDate;
	}

	public String getQuotaDimension() {
		return this.quotaDimension;
	}
	public void setQuotaDimension(String quotaDimension) {
		this.quotaDimension = quotaDimension;
	}

	public String getQuotaTotal() {
		return this.quotaTotal;
	}
	public void setQuotaTotal(String quotaTotal) {
		this.quotaTotal = quotaTotal;
	}

}
