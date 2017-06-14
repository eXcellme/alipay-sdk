package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ComplextMockModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.std.mock.listcomplexmodel.api response.
 * 
 * @author auto create
 * @since 1.0, 2015-10-14 11:57:04
 */
public class AlipayMobilePublicStdMockListcomplexmodelApiResponse extends AlipayResponse {

	private static final long serialVersionUID = 4623294247893518852L;

	/** 
	 * 2xxx
	 */
	@ApiListField("cm_model_list")
	@ApiField("complext_mock_model")
	private List<ComplextMockModel> cmModelList;

	public void setCmModelList(List<ComplextMockModel> cmModelList) {
		this.cmModelList = cmModelList;
	}
	public List<ComplextMockModel> getCmModelList( ) {
		return this.cmModelList;
	}

}
