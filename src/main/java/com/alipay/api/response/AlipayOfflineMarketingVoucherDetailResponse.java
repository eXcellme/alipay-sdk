package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.VoucherCampaignToolInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.marketing.voucher.detail response.
 * 
 * @author auto create
 * @since 1.0, 2016-04-20 16:47:46
 */
public class AlipayOfflineMarketingVoucherDetailResponse extends AlipayResponse {

	private static final long serialVersionUID = 8535472361541484564L;

	/** 
	 * 返回具体的券工具信息
	 */
	@ApiField("voucher_campaign_tool")
	private VoucherCampaignToolInfo voucherCampaignTool;

	public void setVoucherCampaignTool(VoucherCampaignToolInfo voucherCampaignTool) {
		this.voucherCampaignTool = voucherCampaignTool;
	}
	public VoucherCampaignToolInfo getVoucherCampaignTool( ) {
		return this.voucherCampaignTool;
	}

}
