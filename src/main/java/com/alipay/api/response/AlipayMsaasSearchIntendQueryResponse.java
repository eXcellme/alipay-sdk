package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.msaas.search.intend.query response.
 * 
 * @author auto create
 * @since 1.0, 2016-01-20 15:08:33
 */
public class AlipayMsaasSearchIntendQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8722773176533892468L;

	/** 
	 * 意图识别结果，格式为SearchResult格式，透传给客户端，客户端当作搜索结果处理
	 */
	@ApiField("search_result")
	private String searchResult;

	public void setSearchResult(String searchResult) {
		this.searchResult = searchResult;
	}
	public String getSearchResult( ) {
		return this.searchResult;
	}

}
