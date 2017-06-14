package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 1.user_name
2.user_id
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class OverseaSampleResult extends AlipayObject {

	private static final long serialVersionUID = 2419798358791727171L;

	/**
	 * 用户的id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * wangfan
	 */
	@ApiField("user_name")
	private String userName;

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
