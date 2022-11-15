package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 省卡购买咨询
 *
 * @author auto create
 * @since 1.0, 2022-10-25 10:25:20
 */
public class AntMerchantExpandSavingPassQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4344567614187968888L;

	/**
	 * 咨询来源渠道
	 */
	@ApiField("ch_info")
	private String chInfo;

	/**
	 * 商家ID
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 解决方案code ，如省卡付费会员
	 */
	@ApiField("sol_code")
	private String solCode;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getChInfo() {
		return this.chInfo;
	}
	public void setChInfo(String chInfo) {
		this.chInfo = chInfo;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getSolCode() {
		return this.solCode;
	}
	public void setSolCode(String solCode) {
		this.solCode = solCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
