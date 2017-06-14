package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.invoice.apply response.
 * 
 * @author auto create
 * @since 1.0, 2017-03-30 11:59:29
 */
public class AlipayInsSceneInvoiceApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7382436158744983525L;

	/** 
	 * 发票申请单号
	 */
	@ApiField("invoice_apply_no")
	private String invoiceApplyNo;

	/** 
	 * 商户生成的发票申请请求单号【幂等字段】
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public void setInvoiceApplyNo(String invoiceApplyNo) {
		this.invoiceApplyNo = invoiceApplyNo;
	}
	public String getInvoiceApplyNo( ) {
		return this.invoiceApplyNo;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

}
