package com.mercedesme.wx.response;

import com.mercedesme.wx.XStreamDataConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * 回复的视频消息
 * 
 */
@XStreamAlias("xml")
public class WXResponseVideoMessage extends WXResponseBaseMessage {

	private static final long serialVersionUID = -8025800878968804813L;

	@XStreamAlias("Title")
	@XStreamConverter(value = XStreamDataConverter.class)
	private String title;// 音乐标题

	@XStreamAlias("Description")
	@XStreamConverter(value = XStreamDataConverter.class)
	private String description;// 音乐描述

	@XStreamAlias("MusicUrl")
	@XStreamConverter(value = XStreamDataConverter.class)
	private String musicUrl;// 音乐链接

	@XStreamAlias("HQMusicUrl")
	@XStreamConverter(value = XStreamDataConverter.class)
	private String hqMusicUrl;// 高质量音乐链接，WIFI环境优先使用该链接播放音乐

	@XStreamAlias("ThumbMediaId")
	@XStreamConverter(value = XStreamDataConverter.class)
	private String thumbMediaId;// 缩略图的媒体id，通过上传多媒体文件得到的id

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMusicUrl() {
		return this.musicUrl;
	}

	public void setMusicUrl(String musicUrl) {
		this.musicUrl = musicUrl;
	}

	public String getHqMusicUrl() {
		return this.hqMusicUrl;
	}

	public void setHqMusicUrl(String hqMusicUrl) {
		this.hqMusicUrl = hqMusicUrl;
	}

	public String getThumbMediaId() {
		return this.thumbMediaId;
	}

	public void setThumbMediaId(String thumbMediaId) {
		this.thumbMediaId = thumbMediaId;
	}

}
