package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.gotone.message.mail.send response.
 * 
 * @author auto create
 * @since 1.0, 2016-10-21 14:02:47
 */
public class AlipayGotoneMessageMailSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 5131579174161931237L;

	/** 
	 * 返回结果
	 */
	@ApiField("result_code")
	private String resultCode;

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

}
