package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.VehSearchItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.veh.multiterminal.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-06 20:40:34
 */
public class AlipayEcoMycarVehMultiterminalBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7198186629848876991L;

	/** 
	 * 分页页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 搜索结果
	 */
	@ApiListField("search_list")
	@ApiField("veh_search_item")
	private List<VehSearchItem> searchList;

	/** 
	 * 总页码
	 */
	@ApiField("total_page")
	private Long totalPage;

	/** 
	 * 数据总量
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}
	public Long getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setSearchList(List<VehSearchItem> searchList) {
		this.searchList = searchList;
	}
	public List<VehSearchItem> getSearchList( ) {
		return this.searchList;
	}

	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}
	public Long getTotalPage( ) {
		return this.totalPage;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
