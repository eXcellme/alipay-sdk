package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.zdatafront.datatransfered.send response.
 * 
 * @author auto create
 * @since 1.0, 2017-02-14 11:43:27
 */
public class AlipayZdatafrontDatatransferedSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 2872684474657137463L;

	/** 
	 * 表示数据传输是否成功
	 */
	@ApiField("success")
	private String success;

	public void setSuccess(String success) {
		this.success = success;
	}
	public String getSuccess( ) {
		return this.success;
	}

}
