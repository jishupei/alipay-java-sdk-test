package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MenuAnalysisData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.menu.data.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-13 21:00:12
 */
public class AlipayOpenPublicMenuDataBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6498928522212867222L;

	/** 
	 * 菜单分析数据列表
	 */
	@ApiListField("data_list")
	@ApiField("menu_analysis_data")
	private List<MenuAnalysisData> dataList;

	public void setDataList(List<MenuAnalysisData> dataList) {
		this.dataList = dataList;
	}
	public List<MenuAnalysisData> getDataList( ) {
		return this.dataList;
	}

}
