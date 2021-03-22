package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用于在线下场景交易一次创建并支付掉
修改路由策略到R
 *
 * @author auto create
 * @since 1.0, 2021-03-16 19:16:14
 */
public class AlipayTradePayModel extends AlipayObject {

	private static final long serialVersionUID = 5269594766493594643L;

	/**
	 * 支付模式类型,若值为ENJOY_PAY_V2表示当前交易允许走先享后付2.0垫资
	 */
	@ApiField("advance_payment_type")
	private String advancePaymentType;

	/**
	 * 代扣业务需要传入协议相关信息
	 */
	@ApiField("agreement_params")
	private AgreementParams agreementParams;

	/**
	 * 支付宝的店铺编号
	 */
	@ApiField("alipay_store_id")
	private String alipayStoreId;

	/**
	 * 支付授权码，25~30开头的长度为16~24位的数字，实际字符串长度以开发者获取的付款码长度为准。
周期扣款（CYCLE_PAY_AUTH ）场景必填，传入用户签约号 agreement_no。
支付宝预授权（PRE_AUTH_ONLINE）、新当面资金授权（PRE_AUTH）场景不填，需替换为 auth_no 传入资金授权订单号。
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 预授权确认模式，授权转交易请求中传入，适用于预授权转交易业务使用，目前只支持PRE_AUTH(预授权产品码)
COMPLETE：转交易支付完成结束预授权，解冻剩余金额; NOT_COMPLETE：转交易支付完成不结束预授权，不解冻剩余金额
	 */
	@ApiField("auth_confirm_mode")
	private String authConfirmMode;

	/**
	 * 支付宝的资金授权订单号，预授权转交易场景必填。目前仅支持 支付宝预授权（PRE_AUTH_ONLINE）、新当面资金授权（PRE_AUTH）场景使用。
	 */
	@ApiField("auth_no")
	private String authNo;

	/**
	 * 订单描述
	 */
	@ApiField("body")
	private String body;

	/**
	 * 商户传入业务信息，具体值要和支付宝约定，应用于安全，营销等参数直传场景，格式为json格式
	 */
	@ApiField("business_params")
	private BusinessParams businessParams;

	/**
	 * 买家的支付宝用户 ID，若为空，则从传入的码值信息中获取用户 ID
新当面资金授权场景必填。
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 禁用支付渠道,多个渠道以逗号分割，如同时禁用信用支付类型和积分，则disable_pay_channels="credit_group,point"
	 */
	@ApiField("disable_pay_channels")
	private String disablePayChannels;

	/**
	 * 参与优惠计算的金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]。
如果该值未传入，但传入了【订单总金额】和【不可打折金额】，则该值默认为【订单总金额】-【不可打折金额】
	 */
	@ApiField("discountable_amount")
	private String discountableAmount;

	/**
	 * 外部指定买家
	 */
	@ApiField("ext_user_info")
	private ExtUserInfo extUserInfo;

	/**
	 * 业务扩展参数
	 */
	@ApiField("extend_params")
	private ExtendParams extendParams;

	/**
	 * 订单包含的商品列表信息，json格式。
	 */
	@ApiListField("goods_detail")
	@ApiField("goods_detail")
	private List<GoodsDetail> goodsDetail;

	/**
	 * 是否异步支付，传入true时，表明本次期望走异步支付，会先将支付请求受理下来，再异步推进。商户可以通过交易的异步通知或者轮询交易的状态来确定最终的交易结果
	 */
	@ApiField("is_async_pay")
	private Boolean isAsyncPay;

	/**
	 * 商户的原始订单号
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 商户操作员编号。
新当面资金授权场景必填。
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 商户订单号，由商家自定义，64个字符以内，仅支持字母、数字、下划线且需保证在商户端不重复。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 公用回传参数，如果请求时传递了该参数，则返回给商户时会回传该参数。支付宝只会在同步返回（包括跳转回商户网站）和异步通知时将该参数原样返回。本参数必须进行UrlEncode之后才可以发送给支付宝。
	 */
	@ApiField("passback_params")
	private String passbackParams;

	/**
	 * 产品码，默认 FACE_TO_FACE_PAYMENT（当面付），枚举支持：
PRE_AUTH_ONLINE：支付宝预授权。
PRE_AUTH：新当面资金授权。
CYCLE_PAY_AUTH ：周期扣款。
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 优惠明细参数，通过此属性补充营销参数
	 */
	@ApiField("promo_params")
	private PromoParam promoParams;

	/**
	 * 返回查询选项，商户通过上送该参数来定制同步需要额外返回的信息字段，数组格式。如：["fund_bill_list","voucher_detail_list","discount_goods_detail"]
	 */
	@ApiListField("query_options")
	@ApiField("string")
	private List<String> queryOptions;

	/**
	 * 收单机构(例如银行）的标识，填写该机构在支付宝的pid。只在机构间联场景下传递该值。
	 */
	@ApiField("request_org_pid")
	private String requestOrgPid;

	/**
	 * 描述分账信息，json格式，其它说明详见分账说明
	 */
	@ApiField("royalty_info")
	private RoyaltyInfo royaltyInfo;

	/**
	 * 支付场景。条码支付场景固定为：bar_code。
周期扣款后续代扣时必填，固定为 deduct_pay；
新当面资金授权场景固定为 bar_code。
支付宝预授权景无需传入。

	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 如果该值为空，则默认为商户签约账号对应的支付宝用户ID。
新当面资金授权场景必填。
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 商户指定的结算币种，支持英镑：GBP、港币：HKD、美元：USD、新加坡元：SGD、日元：JPY、加拿大元：CAD、澳元：AUD、欧元：EUR、新西兰元：NZD、韩元：KRW、泰铢：THB、瑞士法郎：CHF、瑞典克朗：SEK、丹麦克朗：DKK、挪威克朗：NOK、马来西亚林吉特：MYR、印尼卢比：IDR、菲律宾比索：PHP、毛里求斯卢比：MUR、以色列新谢克尔：ILS、斯里兰卡卢比：LKR、俄罗斯卢布：RUB、阿联酋迪拉姆：AED、捷克克朗：CZK、南非兰特：ZAR、人民币：CNY
	 */
	@ApiField("settle_currency")
	private String settleCurrency;

	/**
	 * 描述结算信息，json格式，详见结算参数说明
	 */
	@ApiField("settle_info")
	private SettleInfo settleInfo;

	/**
	 * 商户门店编号。
新当面资金授权场景必填。
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 间连受理商户信息体，当前只对特殊银行机构特定场景下使用此字段
	 */
	@ApiField("sub_merchant")
	private SubMerchant subMerchant;

	/**
	 * 商品标题/交易标题/订单标题/订单关键字等。 
注意：不可使用特殊字符，如 /，=，& 等。
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 商户机具终端编号
	 */
	@ApiField("terminal_id")
	private String terminalId;

	/**
	 * 商户传入终端设备相关信息，具体值要和支付宝约定
	 */
	@ApiField("terminal_params")
	private String terminalParams;

	/**
	 * 该笔订单允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。 该参数数值不接受小数点， 如 1.5h，可转换为 90m。
当面付场景默认超时时间为3h，且最大时间不超过 3h。若当面付场景设置timeout_express>3h，接口不报错，但是订单将在3小时关闭。
	 */
	@ApiField("timeout_express")
	private String timeoutExpress;

	/**
	 * 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
如果同时传入【可打折金额】和【不可打折金额】，该参数可以不用传入；
如果同时传入了【可打折金额】，【不可打折金额】，【订单总金额】三者，则必须满足如下条件：【订单总金额】=【可打折金额】+【不可打折金额】
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 标价币种,  total_amount 对应的币种单位。支持英镑：GBP、港币：HKD、美元：USD、新加坡元：SGD、日元：JPY、加拿大元：CAD、澳元：AUD、欧元：EUR、新西兰元：NZD、韩元：KRW、泰铢：THB、瑞士法郎：CHF、瑞典克朗：SEK、丹麦克朗：DKK、挪威克朗：NOK、马来西亚林吉特：MYR、印尼卢比：IDR、菲律宾比索：PHP、毛里求斯卢比：MUR、以色列新谢克尔：ILS、斯里兰卡卢比：LKR、俄罗斯卢布：RUB、阿联酋迪拉姆：AED、捷克克朗：CZK、南非兰特：ZAR、人民币：CNY
	 */
	@ApiField("trans_currency")
	private String transCurrency;

	/**
	 * 不参与优惠计算的金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]。如果该值未传入，但传入了【订单总金额】和【可打折金额】，则该值默认为【订单总金额】-【可打折金额】
	 */
	@ApiField("undiscountable_amount")
	private String undiscountableAmount;

	public String getAdvancePaymentType() {
		return this.advancePaymentType;
	}
	public void setAdvancePaymentType(String advancePaymentType) {
		this.advancePaymentType = advancePaymentType;
	}

	public AgreementParams getAgreementParams() {
		return this.agreementParams;
	}
	public void setAgreementParams(AgreementParams agreementParams) {
		this.agreementParams = agreementParams;
	}

	public String getAlipayStoreId() {
		return this.alipayStoreId;
	}
	public void setAlipayStoreId(String alipayStoreId) {
		this.alipayStoreId = alipayStoreId;
	}

	public String getAuthCode() {
		return this.authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getAuthConfirmMode() {
		return this.authConfirmMode;
	}
	public void setAuthConfirmMode(String authConfirmMode) {
		this.authConfirmMode = authConfirmMode;
	}

	public String getAuthNo() {
		return this.authNo;
	}
	public void setAuthNo(String authNo) {
		this.authNo = authNo;
	}

	public String getBody() {
		return this.body;
	}
	public void setBody(String body) {
		this.body = body;
	}

	public BusinessParams getBusinessParams() {
		return this.businessParams;
	}
	public void setBusinessParams(BusinessParams businessParams) {
		this.businessParams = businessParams;
	}

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getDisablePayChannels() {
		return this.disablePayChannels;
	}
	public void setDisablePayChannels(String disablePayChannels) {
		this.disablePayChannels = disablePayChannels;
	}

	public String getDiscountableAmount() {
		return this.discountableAmount;
	}
	public void setDiscountableAmount(String discountableAmount) {
		this.discountableAmount = discountableAmount;
	}

	public ExtUserInfo getExtUserInfo() {
		return this.extUserInfo;
	}
	public void setExtUserInfo(ExtUserInfo extUserInfo) {
		this.extUserInfo = extUserInfo;
	}

	public ExtendParams getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(ExtendParams extendParams) {
		this.extendParams = extendParams;
	}

	public List<GoodsDetail> getGoodsDetail() {
		return this.goodsDetail;
	}
	public void setGoodsDetail(List<GoodsDetail> goodsDetail) {
		this.goodsDetail = goodsDetail;
	}

	public Boolean getIsAsyncPay() {
		return this.isAsyncPay;
	}
	public void setIsAsyncPay(Boolean isAsyncPay) {
		this.isAsyncPay = isAsyncPay;
	}

	public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}
	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getPassbackParams() {
		return this.passbackParams;
	}
	public void setPassbackParams(String passbackParams) {
		this.passbackParams = passbackParams;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public PromoParam getPromoParams() {
		return this.promoParams;
	}
	public void setPromoParams(PromoParam promoParams) {
		this.promoParams = promoParams;
	}

	public List<String> getQueryOptions() {
		return this.queryOptions;
	}
	public void setQueryOptions(List<String> queryOptions) {
		this.queryOptions = queryOptions;
	}

	public String getRequestOrgPid() {
		return this.requestOrgPid;
	}
	public void setRequestOrgPid(String requestOrgPid) {
		this.requestOrgPid = requestOrgPid;
	}

	public RoyaltyInfo getRoyaltyInfo() {
		return this.royaltyInfo;
	}
	public void setRoyaltyInfo(RoyaltyInfo royaltyInfo) {
		this.royaltyInfo = royaltyInfo;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getSettleCurrency() {
		return this.settleCurrency;
	}
	public void setSettleCurrency(String settleCurrency) {
		this.settleCurrency = settleCurrency;
	}

	public SettleInfo getSettleInfo() {
		return this.settleInfo;
	}
	public void setSettleInfo(SettleInfo settleInfo) {
		this.settleInfo = settleInfo;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public SubMerchant getSubMerchant() {
		return this.subMerchant;
	}
	public void setSubMerchant(SubMerchant subMerchant) {
		this.subMerchant = subMerchant;
	}

	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTerminalId() {
		return this.terminalId;
	}
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}

	public String getTerminalParams() {
		return this.terminalParams;
	}
	public void setTerminalParams(String terminalParams) {
		this.terminalParams = terminalParams;
	}

	public String getTimeoutExpress() {
		return this.timeoutExpress;
	}
	public void setTimeoutExpress(String timeoutExpress) {
		this.timeoutExpress = timeoutExpress;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getTransCurrency() {
		return this.transCurrency;
	}
	public void setTransCurrency(String transCurrency) {
		this.transCurrency = transCurrency;
	}

	public String getUndiscountableAmount() {
		return this.undiscountableAmount;
	}
	public void setUndiscountableAmount(String undiscountableAmount) {
		this.undiscountableAmount = undiscountableAmount;
	}

}
