package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DishRecommend;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.recommend.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-21 16:52:32
 */
public class KoubeiCateringDishRecommendQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5254676678938748292L;

	/** 
	 * 推荐菜品列表
	 */
	@ApiListField("dish_list")
	@ApiField("dish_recommend")
	private List<DishRecommend> dishList;

	public void setDishList(List<DishRecommend> dishList) {
		this.dishList = dishList;
	}
	public List<DishRecommend> getDishList( ) {
		return this.dishList;
	}

}
