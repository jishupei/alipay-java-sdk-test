package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: monitor.heartbeat.syn response.
 * 
 * @author auto create
 * @since 1.0, 2022-03-10 16:31:12
 */
public class MonitorHeartbeatSynResponse extends AlipayResponse {

	private static final long serialVersionUID = 8333233281421913133L;

	/** 
	 * 商户pid
	 */
	@ApiField("pid")
	private String pid;

	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPid( ) {
		return this.pid;
	}

}
