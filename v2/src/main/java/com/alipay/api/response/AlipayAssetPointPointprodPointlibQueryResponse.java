package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PointLibResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.point.pointprod.pointlib.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-12 19:35:00
 */
public class AlipayAssetPointPointprodPointlibQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3479653297941835718L;

	/** 
	 * 集分宝积分库查询结果，包含积分库ID，名称，余额等
	 */
	@ApiField("result")
	private PointLibResult result;

	public void setResult(PointLibResult result) {
		this.result = result;
	}
	public PointLibResult getResult( ) {
		return this.result;
	}

}
