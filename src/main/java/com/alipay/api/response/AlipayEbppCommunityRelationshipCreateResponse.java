package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.community.relationship.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-06-25 16:36:26
 */
public class AlipayEbppCommunityRelationshipCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7141467951259871829L;

	/** 
	 * 物业和小区的绑定实体ID
	 */
	@ApiField("relationship_id")
	private String relationshipId;

	public void setRelationshipId(String relationshipId) {
		this.relationshipId = relationshipId;
	}
	public String getRelationshipId( ) {
		return this.relationshipId;
	}

}
