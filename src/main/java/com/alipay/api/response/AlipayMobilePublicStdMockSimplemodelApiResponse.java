package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SimpleMockModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.std.mock.simplemodel.api response.
 * 
 * @author auto create
 * @since 1.0, 2015-10-14 12:01:02
 */
public class AlipayMobilePublicStdMockSimplemodelApiResponse extends AlipayResponse {

	private static final long serialVersionUID = 1718985552438329265L;

	/** 
	 * 简单模型
	 */
	@ApiField("biz_model")
	private SimpleMockModel bizModel;

	public void setBizModel(SimpleMockModel bizModel) {
		this.bizModel = bizModel;
	}
	public SimpleMockModel getBizModel( ) {
		return this.bizModel;
	}

}
