package com.mercedesme.wx.response;

import com.mercedesme.wx.XStreamCDataConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * 回复的视频消息
 * 
 */
@XStreamAlias("xml")
public class WXResponseMusicMessage extends WXResponseBaseMessage {
	private static final long serialVersionUID = 1448279933505693204L;
	@XStreamAlias("MediaId")
	@XStreamConverter(value = XStreamCDataConverter.class)
	private String mediaId;
	@XStreamAlias("ThumbMediaId")
	@XStreamConverter(value = XStreamCDataConverter.class)
	private String thumbMediaId;
	public String getMediaId() {
		return this.mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	public String getThumbMediaId() {
		return this.thumbMediaId;
	}

	public void setThumbMediaId(String thumbMediaId) {
		this.thumbMediaId = thumbMediaId;
	}
	
}
