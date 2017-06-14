package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.parking.order.pay response.
 * 
 * @author auto create
 * @since 1.0, 2016-12-06 22:53:26
 */
public class AlipayEcoMycarParkingOrderPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 7516229624535168667L;

	/** 
	 * 该笔交易的买家付款时间。
格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_payment")
	private String gmtPayment;

	/** 
	 * 对应商户网站的订单系统中的唯一订单号，非支付宝交易号。
需保证在商户网站中的唯一性。是请求时对应的参数，原样返回。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 交易金额
保留小数点后两位
	 */
	@ApiField("total_fee")
	private String totalFee;

	/** 
	 * 该交易在支付宝系统中的交易流水号。系统唯一，最短16位，最长64位
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/** 
	 * 买家支付宝用户ID，用于标识订单扣款用户及订单回传使用
	 */
	@ApiField("user_id")
	private String userId;

	public void setGmtPayment(String gmtPayment) {
		this.gmtPayment = gmtPayment;
	}
	public String getGmtPayment( ) {
		return this.gmtPayment;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}
	public String getTotalFee( ) {
		return this.totalFee;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
