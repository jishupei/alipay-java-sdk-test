package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.matchuser.follow.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:13:47
 */
public class AlipayOpenPublicMatchuserFollowQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7647199669452269684L;

	/** 
	 * 用户是否关注，T代表已关注，F代表未关注
	 */
	@ApiField("is_follow")
	private String isFollow;

	/** 
	 * 支付宝用户id，2088开头的16位长度字符串
	 */
	@ApiField("user_id")
	private String userId;

	public void setIsFollow(String isFollow) {
		this.isFollow = isFollow;
	}
	public String getIsFollow( ) {
		return this.isFollow;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
