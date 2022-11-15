package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AmpeDeviceTypeInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.ampe.devicetype.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2020-07-06 10:10:13
 */
public class AlipayOpenMiniAmpeDevicetypeBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3722229116679492244L;

	/** 
	 * 设备类型列表
	 */
	@ApiListField("device_type_list")
	@ApiField("ampe_device_type_info")
	private List<AmpeDeviceTypeInfo> deviceTypeList;

	public void setDeviceTypeList(List<AmpeDeviceTypeInfo> deviceTypeList) {
		this.deviceTypeList = deviceTypeList;
	}
	public List<AmpeDeviceTypeInfo> getDeviceTypeList( ) {
		return this.deviceTypeList;
	}

}
