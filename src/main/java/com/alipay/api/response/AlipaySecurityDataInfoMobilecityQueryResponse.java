package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SecuritydataMobileCity;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.data.info.mobilecity.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-01-03 17:38:43
 */
public class AlipaySecurityDataInfoMobilecityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1894345421111898765L;

	/** 
	 * 手机归属地对象,三个field均为string类型,手机号前七,phoneNumber; ,省份province;,城市city;
	 */
	@ApiField("mobile_city")
	private SecuritydataMobileCity mobileCity;

	public void setMobileCity(SecuritydataMobileCity mobileCity) {
		this.mobileCity = mobileCity;
	}
	public SecuritydataMobileCity getMobileCity( ) {
		return this.mobileCity;
	}

}