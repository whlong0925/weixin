package com.mercedesme.wx.message;

import com.mercedesme.wx.XStreamDataConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * 文本消息
 *
 */
@XStreamAlias("xml")
public class WXVideoMessage extends WXBaseMessage {

	private static final long serialVersionUID = -2548991570040584285L;
	// 视频消息缩略图的媒体id，可以调用多媒体文件下载接口拉取数据。
	@XStreamAlias("ThumbMediaId")
	@XStreamConverter(value = XStreamDataConverter.class)
	private String thumbMediaId;
	// 视频消息媒体id，可以调用多媒体文件下载接口拉取数据。
	@XStreamAlias("MediaId")
	@XStreamConverter(value = XStreamDataConverter.class)
	private String mediaId;

	public String getThumbMediaId() {
		return this.thumbMediaId;
	}

	public void setThumbMediaId(String thumbMediaId) {
		this.thumbMediaId = thumbMediaId;
	}

	public String getMediaId() {
		return this.mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

}