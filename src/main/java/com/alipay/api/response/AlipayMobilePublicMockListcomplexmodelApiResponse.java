package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OldComplextMockModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.mock.listcomplexmodel.api response.
 * 
 * @author auto create
 * @since 1.0, 2015-05-06 16:53:01
 */
public class AlipayMobilePublicMockListcomplexmodelApiResponse extends AlipayResponse {

	private static final long serialVersionUID = 8349317649918645377L;

	/** 
	 * 208x
	 */
	@ApiListField("cm_model_list")
	@ApiField("old_complext_mock_model")
	private List<OldComplextMockModel> cmModelList;

	public void setCmModelList(List<OldComplextMockModel> cmModelList) {
		this.cmModelList = cmModelList;
	}
	public List<OldComplextMockModel> getCmModelList( ) {
		return this.cmModelList;
	}

}
