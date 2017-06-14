package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.cert.audit.get response.
 * 
 * @author auto create
 * @since 1.0, 2014-06-12 17:15:38
 */
public class AlipayUserCertAuditGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2623452729758123394L;

	/** 
	 * 审核失败原因
	 */
	@ApiField("fail_reason")
	private String failReason;

	/** 
	 * 审核状态
	 */
	@ApiField("status")
	private String status;

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}
	public String getFailReason( ) {
		return this.failReason;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
