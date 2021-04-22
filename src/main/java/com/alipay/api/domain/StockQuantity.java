package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 库存查询
 *
 * @author auto create
 * @since 1.0, 2018-10-22 15:19:51
 */
public class StockQuantity extends AlipayObject {

	private static final long serialVersionUID = 5462362637611845268L;

	/**
	 * 日期
	 */
	@ApiField("date")
	private Date date;

	/**
	 * 库存量
	 */
	@ApiField("quantity")
	private Long quantity;

	public Date getDate() {
		return this.date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

}
