package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InsMktCampaignDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.marketing.campaign.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-03-15 19:36:43
 */
public class AlipayInsMarketingCampaignQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1741435124865712396L;

	/** 
	 * 保险营销活动信息
	 */
	@ApiField("mkt_campaign")
	private InsMktCampaignDTO mktCampaign;

	public void setMktCampaign(InsMktCampaignDTO mktCampaign) {
		this.mktCampaign = mktCampaign;
	}
	public InsMktCampaignDTO getMktCampaign( ) {
		return this.mktCampaign;
	}

}
