package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.file.url.upload response.
 * 
 * @author auto create
 * @since 1.0, 2021-10-18 10:47:48
 */
public class AlipaySocialBaseFileUrlUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 5523522641937165496L;

	/** 
	 * 文件id
	 */
	@ApiField("file_id")
	private String fileId;

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	public String getFileId( ) {
		return this.fileId;
	}

}
