package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MerchantBrandListResult;
import com.alipay.api.domain.MiniappBrandAuditResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.miniapp.brand.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-09 00:11:24
 */
public class AlipayOpenMiniMiniappBrandQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2526873154174189322L;

	/** 
	 * 商户已有品牌
	 */
	@ApiField("merchant_brand_list_result")
	private MerchantBrandListResult merchantBrandListResult;

	/** 
	 * 小程序品牌认证结果
	 */
	@ApiField("miniapp_brand_audit_result")
	private MiniappBrandAuditResult miniappBrandAuditResult;

	public void setMerchantBrandListResult(MerchantBrandListResult merchantBrandListResult) {
		this.merchantBrandListResult = merchantBrandListResult;
	}
	public MerchantBrandListResult getMerchantBrandListResult( ) {
		return this.merchantBrandListResult;
	}

	public void setMiniappBrandAuditResult(MiniappBrandAuditResult miniappBrandAuditResult) {
		this.miniappBrandAuditResult = miniappBrandAuditResult;
	}
	public MiniappBrandAuditResult getMiniappBrandAuditResult( ) {
		return this.miniappBrandAuditResult;
	}

}