package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.StockPositionVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.stock.stocktool.deliver.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-02-21 11:12:06
 */
public class AntfortuneStockStocktoolDeliverQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1427813943595854344L;

	/** 
	 * 展位准入列表
	 */
	@ApiListField("position_list")
	@ApiField("stock_position_v_o")
	private List<StockPositionVO> positionList;

	/** 
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public void setPositionList(List<StockPositionVO> positionList) {
		this.positionList = positionList;
	}
	public List<StockPositionVO> getPositionList( ) {
		return this.positionList;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
