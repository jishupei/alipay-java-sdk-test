package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LogisticsAccountStatusDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.instantdelivery.account.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-14 20:30:50
 */
public class AlipayOpenInstantdeliveryAccountCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2467317667881554448L;

	/** 
	 * 配送公司账户创建结果列表
	 */
	@ApiListField("logistics_account_status")
	@ApiField("logistics_account_status_d_t_o")
	private List<LogisticsAccountStatusDTO> logisticsAccountStatus;

	public void setLogisticsAccountStatus(List<LogisticsAccountStatusDTO> logisticsAccountStatus) {
		this.logisticsAccountStatus = logisticsAccountStatus;
	}
	public List<LogisticsAccountStatusDTO> getLogisticsAccountStatus( ) {
		return this.logisticsAccountStatus;
	}

}
