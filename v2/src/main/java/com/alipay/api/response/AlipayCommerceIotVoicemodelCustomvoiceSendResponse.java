package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.voicemodel.customvoice.send response.
 * 
 * @author auto create
 * @since 1.0, 2021-04-09 15:07:34
 */
public class AlipayCommerceIotVoicemodelCustomvoiceSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 8793787233493381166L;

	/** 
	 * 调用的任务id
	 */
	@ApiField("task_id")
	private String taskId;

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskId( ) {
		return this.taskId;
	}

}
