package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 取消订单或退货完成反馈接口
 *
 * @author auto create
 * @since 1.0, 2021-11-25 19:42:00
 */
public class AntMerchantExpandAssetreverseCompleteSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2847375744792217157L;

	/**
	 * 取消订单或退货成功入参
	 */
	@ApiListField("asset_reverse_details")
	@ApiField("asset_reverse_detail")
	private List<AssetReverseDetail> assetReverseDetails;

	public List<AssetReverseDetail> getAssetReverseDetails() {
		return this.assetReverseDetails;
	}
	public void setAssetReverseDetails(List<AssetReverseDetail> assetReverseDetails) {
		this.assetReverseDetails = assetReverseDetails;
	}

}
