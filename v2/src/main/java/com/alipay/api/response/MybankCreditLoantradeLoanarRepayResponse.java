package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.loanar.repay response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-19 15:45:55
 */
public class MybankCreditLoantradeLoanarRepayResponse extends AlipayResponse {

	private static final long serialVersionUID = 4263198685787993865L;

	/** 
	 * 受理事件编号
	 */
	@ApiField("ev_seq_no")
	private String evSeqNo;

	/** 
	 * 合约编号
	 */
	@ApiField("loan_ar_no")
	private String loanArNo;

	public void setEvSeqNo(String evSeqNo) {
		this.evSeqNo = evSeqNo;
	}
	public String getEvSeqNo( ) {
		return this.evSeqNo;
	}

	public void setLoanArNo(String loanArNo) {
		this.loanArNo = loanArNo;
	}
	public String getLoanArNo( ) {
		return this.loanArNo;
	}

}
