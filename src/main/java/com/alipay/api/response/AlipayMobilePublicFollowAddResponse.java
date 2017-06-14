package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.follow.add response.
 * 
 * @author auto create
 * @since 1.0, 2016-01-06 21:23:22
 */
public class AlipayMobilePublicFollowAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 8214845798311946425L;

	/** 
	 * 成功与否的标志
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 添加关注失败
	 */
	@ApiField("msg")
	private String msg;

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg( ) {
		return this.msg;
	}

}
