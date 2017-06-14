package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 验证通知
 *
 * @author auto create
 * @since 1.0, 2017-02-13 12:04:43
 */
public class AlipayOpenAppNotifyVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 8122231414119745238L;

	/**
	 * 通知id
	 */
	@ApiField("notify_id")
	private String notifyId;

	public String getNotifyId() {
		return this.notifyId;
	}
	public void setNotifyId(String notifyId) {
		this.notifyId = notifyId;
	}

}