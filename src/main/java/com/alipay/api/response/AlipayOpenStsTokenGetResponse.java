package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sts.token.get response.
 * 
 * @author auto create
 * @since 1.0, 2021-02-26 16:57:31
 */
public class AlipayOpenStsTokenGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2185572197556942312L;

	/** 
	 * 安全令牌失效时间（1970年1月1日00:00:00开始算起的毫秒数）
	 */
	@ApiField("expiration")
	private String expiration;

	/** 
	 * 安全令牌
	 */
	@ApiField("security_token")
	private String securityToken;

	public void setExpiration(String expiration) {
		this.expiration = expiration;
	}
	public String getExpiration( ) {
		return this.expiration;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
	}
	public String getSecurityToken( ) {
		return this.securityToken;
	}

}
