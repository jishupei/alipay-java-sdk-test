package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.StageGroupInfoVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.train.stagecaterelation.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-26 11:09:08
 */
public class AlipayCommerceEducateTrainStagecaterelationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8599765143828595982L;

	/** 
	 * 学段分组信息
	 */
	@ApiListField("stage_group_infos")
	@ApiField("stage_group_info_v_o")
	private List<StageGroupInfoVO> stageGroupInfos;

	public void setStageGroupInfos(List<StageGroupInfoVO> stageGroupInfos) {
		this.stageGroupInfos = stageGroupInfos;
	}
	public List<StageGroupInfoVO> getStageGroupInfos( ) {
		return this.stageGroupInfos;
	}

}
