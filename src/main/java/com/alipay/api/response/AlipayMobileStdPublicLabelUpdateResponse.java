package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.std.public.label.update response.
 * 
 * @author auto create
 * @since 1.0, 2016-07-27 17:05:11
 */
public class AlipayMobileStdPublicLabelUpdateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3836889776992217181L;

	/** 
	 * 标签编号
	 */
	@ApiField("id")
	private Long id;

	public void setId(Long id) {
		this.id = id;
	}
	public Long getId( ) {
		return this.id;
	}

}
