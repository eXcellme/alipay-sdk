package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.alisis.speedup.enable response.
 * 
 * @author auto create
 * @since 1.0, 2015-09-07 16:12:06
 */
public class AlipayDataAlisisSpeedupEnableResponse extends AlipayResponse {

	private static final long serialVersionUID = 2673647678496522124L;

	/** 
	 * 加速是否成功
	 */
	@ApiField("data")
	private String data;

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

}
