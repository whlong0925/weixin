package com.mercedesme.wx.response;

import com.mercedesme.wx.XStreamDataConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * 回复的语音消息
 * 
 */
@XStreamAlias("xml")
public class WXResponseVoiceMessage extends WXResponseBaseMessage {
	private static final long serialVersionUID = 1448279933505693204L;
	@XStreamAlias("MediaId")
	@XStreamConverter(value = XStreamDataConverter.class)
	private String mediaId;

	public String getMediaId() {
		return this.mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}
}
