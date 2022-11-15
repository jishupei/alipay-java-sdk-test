package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 司机信息查询接口
 *
 * @author auto create
 * @since 1.0, 2022-10-27 16:35:21
 */
public class AlipayCommerceTransportTaxiDriverinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8839589189577387293L;

	/**
	 * 司机身份证号码
	 */
	@ApiField("driver_cert_no")
	private String driverCertNo;

	/**
	 * 请求时间，Unix Timestamp单位毫秒
	 */
	@ApiField("request_time")
	private String requestTime;

	public String getDriverCertNo() {
		return this.driverCertNo;
	}
	public void setDriverCertNo(String driverCertNo) {
		this.driverCertNo = driverCertNo;
	}

	public String getRequestTime() {
		return this.requestTime;
	}
	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}

}
