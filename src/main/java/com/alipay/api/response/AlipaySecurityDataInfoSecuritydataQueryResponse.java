package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.data.info.securitydata.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-10 11:36:36
 */
public class AlipaySecurityDataInfoSecuritydataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7216523138335487613L;

	/** 
	 * 查询结果,
结果为json格式
返回值的key, 为入参查询值的主体.
返回值的value, 为入参查询值的结果.以风控黑名单为例,在黑名单中返回"hasRisk",不在黑名单中返回"noRisk".
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
