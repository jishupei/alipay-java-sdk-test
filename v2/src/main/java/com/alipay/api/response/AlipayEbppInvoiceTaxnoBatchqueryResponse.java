package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InvoiceElementModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.taxno.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-10 14:29:43
 */
public class AlipayEbppInvoiceTaxnoBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3463787343571982279L;

	/** 
	 * 发票要素列表
	 */
	@ApiListField("invoice_element_list")
	@ApiField("invoice_element_model")
	private List<InvoiceElementModel> invoiceElementList;

	/** 
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	public void setInvoiceElementList(List<InvoiceElementModel> invoiceElementList) {
		this.invoiceElementList = invoiceElementList;
	}
	public List<InvoiceElementModel> getInvoiceElementList( ) {
		return this.invoiceElementList;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
