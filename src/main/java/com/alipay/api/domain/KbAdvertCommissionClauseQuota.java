package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑广告系统分佣规则(定额)
 *
 * @author auto create
 * @since 1.0, 2017-01-17 10:33:12
 */
public class KbAdvertCommissionClauseQuota extends AlipayObject {

	private static final long serialVersionUID = 8686429454452426768L;

	/**
	 * 定额结束范围(精度2位的非负小数)
	 */
	@ApiField("quota_amount_end")
	private String quotaAmountEnd;

	/**
	 * 定额开始范围(精度2位的非负小数)
	 */
	@ApiField("quota_amount_start")
	private String quotaAmountStart;

	public String getQuotaAmountEnd() {
		return this.quotaAmountEnd;
	}
	public void setQuotaAmountEnd(String quotaAmountEnd) {
		this.quotaAmountEnd = quotaAmountEnd;
	}

	public String getQuotaAmountStart() {
		return this.quotaAmountStart;
	}
	public void setQuotaAmountStart(String quotaAmountStart) {
		this.quotaAmountStart = quotaAmountStart;
	}

}
