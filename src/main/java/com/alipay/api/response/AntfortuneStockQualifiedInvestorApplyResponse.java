package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InvestorMaterialInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.stock.qualified.investor.apply response.
 * 
 * @author auto create
 * @since 1.0, 2021-11-02 17:40:34
 */
public class AntfortuneStockQualifiedInvestorApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3486384847829712913L;

	/** 
	 * 来之请求的签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/** 
	 * 支付宝金融总资产金额，单位元；精度到分
	 */
	@ApiField("alipay_total_asset")
	private String alipayTotalAsset;

	/** 
	 * 余额宝首次交易时间
	 */
	@ApiField("first_yeb_trade_day")
	private String firstYebTradeDay;

	/** 
	 * 材料列表
	 */
	@ApiListField("material_list")
	@ApiField("investor_material_info")
	private List<InvestorMaterialInfo> materialList;

	/** 
	 * traceId，用来唯一定位某次调用，方便问题排查
	 */
	@ApiField("trace_id")
	private String traceId;

	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}
	public String getAgreementNo( ) {
		return this.agreementNo;
	}

	public void setAlipayTotalAsset(String alipayTotalAsset) {
		this.alipayTotalAsset = alipayTotalAsset;
	}
	public String getAlipayTotalAsset( ) {
		return this.alipayTotalAsset;
	}

	public void setFirstYebTradeDay(String firstYebTradeDay) {
		this.firstYebTradeDay = firstYebTradeDay;
	}
	public String getFirstYebTradeDay( ) {
		return this.firstYebTradeDay;
	}

	public void setMaterialList(List<InvestorMaterialInfo> materialList) {
		this.materialList = materialList;
	}
	public List<InvestorMaterialInfo> getMaterialList( ) {
		return this.materialList;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

}