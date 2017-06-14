package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CommentInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.mcomment.comment.query response.
 * 
 * @author auto create
 * @since 1.0, 2016-11-07 14:32:44
 */
public class AlipaySocialBaseMcommentCommentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3192668138677117856L;

	/** 
	 * 评论列表
	 */
	@ApiListField("comments")
	@ApiField("comment_info")
	private List<CommentInfo> comments;

	public void setComments(List<CommentInfo> comments) {
		this.comments = comments;
	}
	public List<CommentInfo> getComments( ) {
		return this.comments;
	}

}
