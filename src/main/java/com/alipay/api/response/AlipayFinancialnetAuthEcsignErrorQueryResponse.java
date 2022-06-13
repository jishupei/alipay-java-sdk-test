package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ErrorLog;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.financialnet.auth.ecsign.error.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-01-17 13:01:32
 */
public class AlipayFinancialnetAuthEcsignErrorQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6543995341151431971L;

	/** 
	 * 错误信息
	 */
	@ApiListField("error_log_list")
	@ApiField("error_log")
	private List<ErrorLog> errorLogList;

	public void setErrorLogList(List<ErrorLog> errorLogList) {
		this.errorLogList = errorLogList;
	}
	public List<ErrorLog> getErrorLogList( ) {
		return this.errorLogList;
	}

}
