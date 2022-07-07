package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运营 SaaS 投放计划详情查询
 *
 * @author auto create
 * @since 1.0, 2022-07-05 14:39:32
 */
public class DatadigitalFincloudFinsaasPutplanQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7639176751675489279L;

	/**
	 * 投放计划主键 id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 租户 code
	 */
	@ApiField("tenant_code")
	private String tenantCode;

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getTenantCode() {
		return this.tenantCode;
	}
	public void setTenantCode(String tenantCode) {
		this.tenantCode = tenantCode;
	}

}