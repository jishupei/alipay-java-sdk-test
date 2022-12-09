package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 渠道红包活动配置查询接口
 *
 * @author auto create
 * @since 1.0, 2022-05-12 15:58:51
 */
public class AlipayUserDtbankcustChannelvoucherconfigQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5533853769688865138L;

	/**
	 * 在开放活动平台配置活动的唯一id，唯一标志一个活动
	 */
	@ApiField("activity_id")
	private String activityId;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

}