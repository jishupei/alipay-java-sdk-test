package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备机型信息
 *
 * @author auto create
 * @since 1.0, 2020-07-07 20:17:19
 */
public class AmpeDeviceModelInfo extends AlipayObject {

	private static final long serialVersionUID = 6748911226296323965L;

	/**
	 * 硬件参数
	 */
	@ApiField("hardware_params")
	private String hardwareParams;

	/**
	 * 机型id
	 */
	@ApiField("model_id")
	private Long modelId;

	/**
	 * 机型名称
	 */
	@ApiField("model_name")
	private String modelName;

	/**
	 * 机型编号
	 */
	@ApiField("model_no")
	private String modelNo;

	public String getHardwareParams() {
		return this.hardwareParams;
	}
	public void setHardwareParams(String hardwareParams) {
		this.hardwareParams = hardwareParams;
	}

	public Long getModelId() {
		return this.modelId;
	}
	public void setModelId(Long modelId) {
		this.modelId = modelId;
	}

	public String getModelName() {
		return this.modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getModelNo() {
		return this.modelNo;
	}
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

}
