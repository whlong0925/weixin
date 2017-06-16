package com.mercedesme.wx.message;

import com.mercedesme.wx.XStreamDataConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * 文本消息
 *
 */
@XStreamAlias("xml")
public class WXImageMessage extends WXBaseMessage {

	private static final long serialVersionUID = -9057179952499624138L;
	// 语音格式，如amr，speex等
	@XStreamAlias("Format")
	@XStreamConverter(value = XStreamDataConverter.class)
	private String format;
	// 语音消息媒体id，可以调用多媒体文件下载接口拉取数据
	@XStreamAlias("MediaId")
	@XStreamConverter(value = XStreamDataConverter.class)
	private String mediaId;

	public String getFormat() {
		return this.format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getMediaId() {
		return this.mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

}