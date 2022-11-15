package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业财受理参与者模型
 *
 * @author auto create
 * @since 1.0, 2022-06-10 11:41:26
 */
public class GFAOpenAPIParticipantInfo extends AlipayObject {

	private static final long serialVersionUID = 1576967239198275164L;

	/**
	 * 参与者账户
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 参与者账户类型
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 参与者机构Id
	 */
	@ApiField("inst_code")
	private String instCode;

	/**
	 * 参与者角色id（如支付宝中的uid）
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 参与者扩展信息。Map<String, String> 类型 JSON 字符串
	 */
	@ApiField("properties")
	private String properties;

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getInstCode() {
		return this.instCode;
	}
	public void setInstCode(String instCode) {
		this.instCode = instCode;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public String getProperties() {
		return this.properties;
	}
	public void setProperties(String properties) {
		this.properties = properties;
	}

}
