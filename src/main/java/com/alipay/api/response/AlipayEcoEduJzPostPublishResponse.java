package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.edu.jz.post.publish response.
 * 
 * @author auto create
 * @since 1.0, 2016-12-15 00:03:56
 */
public class AlipayEcoEduJzPostPublishResponse extends AlipayResponse {

	private static final long serialVersionUID = 7615976468841176466L;

	/** 
	 * 职位编号
	 */
	@ApiField("third_id")
	private String thirdId;

	public void setThirdId(String thirdId) {
		this.thirdId = thirdId;
	}
	public String getThirdId( ) {
		return this.thirdId;
	}

}
