package com.mercedesme.wx.response;

import com.mercedesme.wx.XStreamCDataConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * 回复的图片消息
 * 
 */
@XStreamAlias("xml")
public class WXResponseImageMessage extends WXResponseBaseMessage {
	private static final long serialVersionUID = 6734496758147161403L;
	@XStreamAlias("MediaId")
	@XStreamConverter(value = XStreamCDataConverter.class)
	private String mediaId;

	public String getMediaId() {
		return this.mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}
}
