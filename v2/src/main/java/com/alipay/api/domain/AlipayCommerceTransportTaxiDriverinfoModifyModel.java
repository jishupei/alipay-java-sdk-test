package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 司机信息变更接口
 *
 * @author auto create
 * @since 1.0, 2022-10-17 11:36:35
 */
public class AlipayCommerceTransportTaxiDriverinfoModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5282931229211457888L;

	/**
	 * 流水号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 司机和车辆信息
	 */
	@ApiField("driver_car_info")
	private DriverCarInfo driverCarInfo;

	/**
	 * 司机uid
	 */
	@ApiField("driver_user_id")
	private String driverUserId;

	/**
	 * 请求时间
	 */
	@ApiField("request_time")
	private String requestTime;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public DriverCarInfo getDriverCarInfo() {
		return this.driverCarInfo;
	}
	public void setDriverCarInfo(DriverCarInfo driverCarInfo) {
		this.driverCarInfo = driverCarInfo;
	}

	public String getDriverUserId() {
		return this.driverUserId;
	}
	public void setDriverUserId(String driverUserId) {
		this.driverUserId = driverUserId;
	}

	public String getRequestTime() {
		return this.requestTime;
	}
	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}

}
