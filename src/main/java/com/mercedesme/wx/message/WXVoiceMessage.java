package com.mercedesme.wx.message;

import com.mercedesme.wx.XStreamCDataConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * 文本消息
 *
 */
@XStreamAlias("xml")
public class WXVoiceMessage extends WXBaseMessage {

	private static final long serialVersionUID = -9057179952499624138L;
	// 图片链接
	@XStreamAlias("PicUrl")
	@XStreamConverter(value = XStreamCDataConverter.class)
	private String picUrl;
	// 图片消息媒体id，可以调用多媒体文件下载接口拉取数据。
	@XStreamAlias("MediaId")
	@XStreamConverter(value = XStreamCDataConverter.class)
	private String mediaId;

	public String getPicUrl() {
		return this.picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getMediaId() {
		return this.mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

}