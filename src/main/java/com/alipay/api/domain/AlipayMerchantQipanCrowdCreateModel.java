package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商家用户人群包创建
 *
 * @author auto create
 * @since 1.0, 2022-08-02 10:29:22
 */
public class AlipayMerchantQipanCrowdCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7841287478953399599L;

	/**
	 * 人群描述
	 */
	@ApiField("crowd_desc")
	private String crowdDesc;

	/**
	 * 人群名称
最大长度为15个字符
	 */
	@ApiField("crowd_name")
	private String crowdName;

	/**
	 * 商户外部用户人群code
用于标识商家人群，需保证同一商户下crowd_code唯一
	 */
	@ApiField("external_crowd_code")
	private String externalCrowdCode;

	/**
	 * 人群包含的用户列表 单次上传用户数上限为1000，若用户量过大可分批通过alipay.merchant.qipan.crowduser.add接口上传
	 */
	@ApiListField("user_list")
	@ApiField("qipan_merchant_crowd_user")
	private List<QipanMerchantCrowdUser> userList;

	public String getCrowdDesc() {
		return this.crowdDesc;
	}
	public void setCrowdDesc(String crowdDesc) {
		this.crowdDesc = crowdDesc;
	}

	public String getCrowdName() {
		return this.crowdName;
	}
	public void setCrowdName(String crowdName) {
		this.crowdName = crowdName;
	}

	public String getExternalCrowdCode() {
		return this.externalCrowdCode;
	}
	public void setExternalCrowdCode(String externalCrowdCode) {
		this.externalCrowdCode = externalCrowdCode;
	}

	public List<QipanMerchantCrowdUser> getUserList() {
		return this.userList;
	}
	public void setUserList(List<QipanMerchantCrowdUser> userList) {
		this.userList = userList;
	}

}
