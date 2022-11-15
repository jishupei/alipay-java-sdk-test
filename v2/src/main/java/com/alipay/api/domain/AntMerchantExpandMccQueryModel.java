package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户mcc信息查询
 *
 * @author auto create
 * @since 1.0, 2022-08-25 14:12:44
 */
public class AntMerchantExpandMccQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3882948383741938999L;

	/**
	 * 传入需要查询的code列表，以分号分隔；注：如果需要查询完整类目树，可以传入ROOT
	 */
	@ApiField("mcc_code_list")
	private String mccCodeList;

	public String getMccCodeList() {
		return this.mccCodeList;
	}
	public void setMccCodeList(String mccCodeList) {
		this.mccCodeList = mccCodeList;
	}

}
