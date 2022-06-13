package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自定义语音播报
 *
 * @author auto create
 * @since 1.0, 2021-04-09 15:06:35
 */
public class AlipayCommerceIotVoicemodelCustomvoiceSendModel extends AlipayObject {

	private static final long serialVersionUID = 2256732213831187217L;

	/**
	 * 服务调用上下文
	 */
	@ApiField("context")
	private ServiceModelContext context;

	/**
	 * 自定义语音调用模型
	 */
	@ApiField("custom_voice")
	private CustomVoiceVO customVoice;

	public ServiceModelContext getContext() {
		return this.context;
	}
	public void setContext(ServiceModelContext context) {
		this.context = context;
	}

	public CustomVoiceVO getCustomVoice() {
		return this.customVoice;
	}
	public void setCustomVoice(CustomVoiceVO customVoice) {
		this.customVoice = customVoice;
	}

}
