package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PromoteDateModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.advert.data.promotesummary.date.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2017-02-16 20:40:11
 */
public class KoubeiAdvertDataPromotesummaryDateBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4795481989884439651L;

	/** 
	 * 口碑客推广日期维度汇总数据
	 */
	@ApiListField("data")
	@ApiField("promote_date_model")
	private List<PromoteDateModel> data;

	public void setData(List<PromoteDateModel> data) {
		this.data = data;
	}
	public List<PromoteDateModel> getData( ) {
		return this.data;
	}

}
