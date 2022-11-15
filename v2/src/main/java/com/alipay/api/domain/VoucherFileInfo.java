package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 凭证文件信息
 *
 * @author auto create
 * @since 1.0, 2022-02-21 14:27:13
 */
public class VoucherFileInfo extends AlipayObject {

	private static final long serialVersionUID = 7663923288735512765L;

	/**
	 * 发票文件下载
	 */
	@ApiField("file_download_url")
	private String fileDownloadUrl;

	/**
	 * 文件名
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 文件类型
	 */
	@ApiField("file_type")
	private String fileType;

	public String getFileDownloadUrl() {
		return this.fileDownloadUrl;
	}
	public void setFileDownloadUrl(String fileDownloadUrl) {
		this.fileDownloadUrl = fileDownloadUrl;
	}

	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileType() {
		return this.fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

}
