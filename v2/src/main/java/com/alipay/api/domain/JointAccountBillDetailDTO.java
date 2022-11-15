package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 共同账户账单明细
 *
 * @author auto create
 * @since 1.0, 2022-11-01 10:46:40
 */
public class JointAccountBillDetailDTO extends AlipayObject {

	private static final long serialVersionUID = 2359395593436978615L;

	/**
	 * 共同账户ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 消费金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 账单业务号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 业务时间
	 */
	@ApiField("biz_date")
	private String bizDate;

	/**
	 * 订单号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 1-退款，2-支付
	 */
	@ApiField("in_out")
	private String inOut;

	/**
	 * 外部交易单号，正向支付为外部交易单号，逆向退款是为外部退款单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 账单标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 共同账户消费的成员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getInOut() {
		return this.inOut;
	}
	public void setInOut(String inOut) {
		this.inOut = inOut;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
