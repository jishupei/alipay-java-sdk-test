package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量失效任务流水
 *
 * @author auto create
 * @since 1.0, 2020-07-27 22:20:57
 */
public class AlipayInsSceneTaskflowBatchFinishModel extends AlipayObject {

	private static final long serialVersionUID = 2261364429458471824L;

	/**
	 * 扩展信息
	 */
	@ApiField("extra_map")
	private String extraMap;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 时效任务流水ID
	 */
	@ApiListField("task_flow_id_list")
	@ApiField("string")
	private List<String> taskFlowIdList;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getExtraMap() {
		return this.extraMap;
	}
	public void setExtraMap(String extraMap) {
		this.extraMap = extraMap;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public List<String> getTaskFlowIdList() {
		return this.taskFlowIdList;
	}
	public void setTaskFlowIdList(List<String> taskFlowIdList) {
		this.taskFlowIdList = taskFlowIdList;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
