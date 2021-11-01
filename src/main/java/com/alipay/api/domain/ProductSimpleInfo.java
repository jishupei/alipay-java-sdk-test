package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文体业务订单的简化产品模型
 *
 * @author auto create
 * @since 1.0, 2021-10-26 15:44:57
 */
public class ProductSimpleInfo extends AlipayObject {

	private static final long serialVersionUID = 2563655728885624424L;

	/**
	 * 商品购买数量
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 商品使用结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 商品名称
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 商品类型，'calendar'-日历型，'ticket'-票券，'course'-课程，'calendar_ticket'-日历型票券
	 */
	@ApiField("product_type")
	private String productType;

	/**
	 * 产品售卖价(单位：元),保留2位小数
	 */
	@ApiField("sale_price")
	private String salePrice;

	/**
	 * 商品使用开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 产品规格信息，仅日历型票券商品需要配置该字段
	 */
	@ApiField("zone_name")
	private String zoneName;

	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return this.productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getSalePrice() {
		return this.salePrice;
	}
	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getZoneName() {
		return this.zoneName;
	}
	public void setZoneName(String zoneName) {
		this.zoneName = zoneName;
	}

}