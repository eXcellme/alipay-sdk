package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 手艺人作品
 *
 * @author auto create
 * @since 1.0, 2017-01-17 17:56:45
 */
public class CraftsmanWorkCreateOpenModel extends AlipayObject {

	private static final long serialVersionUID = 7132718786688753823L;

	/**
	 * 视频资源必传，视频时长，单位(秒)
	 */
	@ApiField("duration")
	private Long duration;

	/**
	 * 媒体资源id（通过 alipay.offline.material.image.upload 接口上传视频/图片获取的资源id）。图片上限最大5M,支持bmp,png,jpeg,jpg,gif格式的图片。视频上限最大50M,支持MP4格式。注意上传视频作品需要组装视频和图片id:1.需要上传视频，获取视频id；2.上传视频头图，获取视频头图id；3.拼接 视频文件的字符串=视频id +竖线+视频头图id。举例：视频id为Qt5XB8R7SMizIC2CZ_qLXAAAACMAAQED，视频头图id为XXwcvckbS_WcT5-mYXtY1QAAACMAAQED；
则视频文件的字符串为Qt5XB8R7SMizIC2CZ_qLXAAAACMAAQED|XXwcvckbS_WcT5-mYXtY1QAAACMAAQED
如果不上传视频头图，只上传视频id的话，则用户看到的视频无视频头图。
	 */
	@ApiField("media_id")
	private String mediaId;

	/**
	 * 媒体类型。仅支持图片/视频格式，图片类型时传入PICTURE；视频类型时传入VIDEO
	 */
	@ApiField("media_type")
	private String mediaType;

	/**
	 * 外部作品id,isv的appId+外部作品id全局唯一
	 */
	@ApiField("out_work_id")
	private String outWorkId;

	/**
	 * 作品标题，上限10个字。
	 */
	@ApiField("title")
	private String title;

	public Long getDuration() {
		return this.duration;
	}
	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public String getMediaId() {
		return this.mediaId;
	}
	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	public String getMediaType() {
		return this.mediaType;
	}
	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}

	public String getOutWorkId() {
		return this.outWorkId;
	}
	public void setOutWorkId(String outWorkId) {
		this.outWorkId = outWorkId;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
