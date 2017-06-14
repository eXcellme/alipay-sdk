package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.performance.status.feedback response.
 * 
 * @author auto create
 * @since 1.0, 2016-09-22 11:48:12
 */
public class ZhimaCustomerPerformanceStatusFeedbackResponse extends AlipayResponse {

	private static final long serialVersionUID = 7574937231831478176L;

	/** 
	 * 合作伙伴请求是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
