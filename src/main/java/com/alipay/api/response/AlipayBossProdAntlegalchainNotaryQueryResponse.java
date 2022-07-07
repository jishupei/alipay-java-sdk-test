package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.NotaryResultDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.antlegalchain.notary.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-05 09:51:51
 */
public class AlipayBossProdAntlegalchainNotaryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1259187875256819195L;

	/** 
	 * 存证信息集合
	 */
	@ApiListField("notaries")
	@ApiField("notary_result_d_t_o")
	private List<NotaryResultDTO> notaries;

	public void setNotaries(List<NotaryResultDTO> notaries) {
		this.notaries = notaries;
	}
	public List<NotaryResultDTO> getNotaries( ) {
		return this.notaries;
	}

}