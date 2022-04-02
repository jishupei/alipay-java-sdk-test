package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ExtCardInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.accountbook.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-01-17 17:59:55
 */
public class AlipayFundAccountbookCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8278283553369641743L;

	/** 
	 * 开通的资金记账本id
	 */
	@ApiField("account_book_id")
	private String accountBookId;

	/** 
	 * 网银入金的外标卡信息
	 */
	@ApiField("ext_card_info")
	private ExtCardInfo extCardInfo;

	public void setAccountBookId(String accountBookId) {
		this.accountBookId = accountBookId;
	}
	public String getAccountBookId( ) {
		return this.accountBookId;
	}

	public void setExtCardInfo(ExtCardInfo extCardInfo) {
		this.extCardInfo = extCardInfo;
	}
	public ExtCardInfo getExtCardInfo( ) {
		return this.extCardInfo;
	}

}
