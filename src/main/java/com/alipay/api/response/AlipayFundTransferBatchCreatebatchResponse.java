package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.transfer.batch.createbatch response.
 * 
 * @author auto create
 * @since 1.0, 2015-09-18 20:05:53
 */
public class AlipayFundTransferBatchCreatebatchResponse extends AlipayResponse {

	private static final long serialVersionUID = 1812591151123332832L;

	/** 
	 * 批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/** 
	 * 扩展参数
	 */
	@ApiField("ext_param")
	private String extParam;

	/** 
	 * token
	 */
	@ApiField("token")
	private String token;

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public String getBatchNo( ) {
		return this.batchNo;
	}

	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}
	public String getExtParam( ) {
		return this.extParam;
	}

	public void setToken(String token) {
		this.token = token;
	}
	public String getToken( ) {
		return this.token;
	}

}
