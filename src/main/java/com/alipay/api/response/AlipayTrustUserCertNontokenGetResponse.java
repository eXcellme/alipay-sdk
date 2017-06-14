package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AliTrustCert;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trust.user.cert.nontoken.get response.
 * 
 * @author auto create
 * @since 1.0, 2014-06-12 17:15:49
 */
public class AlipayTrustUserCertNontokenGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8591172215551259575L;

	/** 
	 * 芝麻信用认证结果
	 */
	@ApiField("ali_trust_cert")
	private AliTrustCert aliTrustCert;

	public void setAliTrustCert(AliTrustCert aliTrustCert) {
		this.aliTrustCert = aliTrustCert;
	}
	public AliTrustCert getAliTrustCert( ) {
		return this.aliTrustCert;
	}

}
